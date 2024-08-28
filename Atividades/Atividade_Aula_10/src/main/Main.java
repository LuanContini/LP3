package main;

import usuario.Usuario;
import usuario.UsuarioAdmin;
import usuario.UsuarioPremium;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {

		Facebook2 facebook2 = new Facebook2();
		Scanner scanner = new Scanner(System.in);

		// Definindo os usuários com nomes e e-mails realistas
		Usuario usuario1 = new UsuarioPremium("Carlos Oliveira", "senha1", "carlos.oliveira@gmail.com");
		Usuario usuario2 = new Usuario("Ana Silva", "senha2", "ana.silva@gmail.com");
		Usuario usuario3 = new UsuarioPremium("João Souza", "senha3", "joao.souza@gmail.com");
		Usuario usuario4 = new Usuario("Mariana Costa", "senha4", "mariana.costa@gmail.com");
		Usuario usuario5 = new UsuarioPremium("Pedro Santos", "senha5", "pedro.santos@gmail.com");
		Usuario admin = new UsuarioAdmin("Admin User", "admin", "admin");

		facebook2.adicionarUsuario(usuario1);
		facebook2.adicionarUsuario(usuario2);
		facebook2.adicionarUsuario(usuario3);
		facebook2.adicionarUsuario(usuario4);
		facebook2.adicionarUsuario(usuario5);
		facebook2.adicionarUsuario(admin);

		facebook2.criarPostagem("Acabei de começar a assistir uma série nova. Alguém já viu 'Exploradores do Espaço'? Recomendo muito!", usuario1);
		facebook2.criarPostagem("Hoje foi um dia incrível! Consegui finalizar aquele projeto que estava me deixando louco. Vitória!", usuario1);
		facebook2.criarPostagem("Alguém sabe uma boa receita de bolo de cenoura? Quero tentar fazer esse fim de semana.", usuario1);

		facebook2.criarPostagem("Acordar cedo não é fácil, mas vale a pena. Alguém mais gosta de fazer caminhadas matinais?", usuario2);
		facebook2.criarPostagem("Feliz aniversário para o melhor amigo do mundo! Que seu dia seja tão incrível quanto você!", usuario2);
		facebook2.criarPostagem("Refletindo sobre o impacto das redes sociais na nossa vida. O que vocês acham? Estão ajudando ou atrapalhando?", usuario2);

		facebook2.criarPostagem("Estou tão animado para o show da próxima semana! Quem mais vai?", usuario3);
		facebook2.criarPostagem("O pôr do sol hoje estava espetacular! Consegui tirar uma foto incrível.", usuario3);
		facebook2.criarPostagem("Fazendo uma maratona de filmes hoje. Quais são os seus filmes favoritos de todos os tempos?", usuario3);

		facebook2.criarPostagem("Acabei de adotar um cachorro! Ele é tão fofo. Alguma dica para cuidar de filhotes?", usuario4);
		facebook2.criarPostagem("Participando de um curso de fotografia. Aqui está uma das minhas primeiras fotos, o que acham?", usuario4);
		facebook2.criarPostagem("É oficial, estou viciado em café! Alguma recomendação de bons cafés na cidade?", usuario4);

		facebook2.criarPostagem("Lendo um livro incrível sobre desenvolvimento pessoal. Alguém mais gosta desse tipo de leitura?", usuario5);
		facebook2.criarPostagem("Pensando em começar um novo hobby. Talvez pintura ou jardinagem. Alguma sugestão?", usuario5);
		facebook2.criarPostagem("Frase do dia: 'A única maneira de fazer um excelente trabalho é amar o que você faz.' – Steve Jobs", usuario5);


		boolean repetir = true;

		do{

			String opcao;

			if (facebook2.getUsuario() == null){
				String resp;
				System.out.println("Nenhum usuario encontrado, gostaria de logar ou criar um usuario novo?\n[1]Criar usuário [2]Login [3]Sair");
				resp = scanner.nextLine();

				switch (resp) {
					case "1":
                        cadastrarUsuario(scanner, facebook2);
						break;

					case "2":
						loginUsuario(scanner, facebook2);
						break;

					default:
						repetir = false;

				}

			}
			else if(repetir) {

				System.out.println("[1]Mostrar postagens existentes");
				System.out.println("[2]Criar postagem");
				System.out.println("[3]Curtir postagem especifica");
				System.out.println("[4]Ver comentários em postagem específica");
				System.out.println("[5]Comentar em postagem");
				System.out.println("[6]Deslogar");
				if (facebook2.getUsuario().getTipoUsuario().equals("admin")){
					System.out.println("[usr]Imprimir usuários");
					System.out.println("[del]Deletar Postagem");
					System.out.println("[ban]Banir usuario");
				}


				opcao = scanner.nextLine();

				switch (opcao) {
					case "1":
						facebook2.imprimirPostagens();
						break;

					case "2":
						System.out.println("Digite o conteúdo de sua postagem");
						facebook2.criarPostagem(scanner.nextLine());
						break;

					case "3":
						System.out.println("Digite o número da postagem: ");

						if (facebook2.adicionarCurtida(scanner.nextInt())){
							System.out.println("Postagem curtida com sucesso\n\n");
						}
						else {
							System.out.println("A postagem não foi encontrada");
						}
						scanner.nextLine();
						break;

					case "4":
						System.out.println("Digite o número da postagem: ");
						if (!facebook2.imprimirComentarios(scanner.nextInt())){
							System.out.println("A postagem não foi encontrada\n");
						}
						scanner.nextLine();
						break;

					case "5":
						System.out.println("Digite o número da postagem: ");
						int numeroPostagem = scanner.nextInt();
						scanner.nextLine();

						if(!facebook2.imprimirPostagens(numeroPostagem)){
							System.out.println("A postagem não foi encontrada");
						}

						System.out.println("Digite o conteúdo de seu comentário:");
						facebook2.comentarPostagem(numeroPostagem, scanner.nextLine());
						break;

					case "usr":
						if (facebook2.isAdmin()){
							facebook2.imprimirUsuarios();
						}
						break;

					case "ban":
						if (facebook2.isAdmin()){
							String razao;
							int idUsuario;
							System.out.println("Digite o id do usuário a ser banido: ");
							idUsuario = scanner.nextInt();
							scanner.nextLine();
							if(!facebook2.imprimirUsuarios(idUsuario)){
								System.out.println("Não foi possível encontrar o usuário");
								break;
							}



							System.out.println("digite a razão de banimento: ");
							razao = scanner.nextLine();

							facebook2.banirUsuario(idUsuario, razao);
							System.out.println("Usuário banido com sucesso");


						}
						break;

					case "del":
						if (facebook2.isAdmin()){
							int numeroPostagemDel;

							System.out.println("Digite o número da postagem:");
							numeroPostagemDel = scanner.nextInt();
							scanner.nextLine();
								if (!facebook2.imprimirPostagens(numeroPostagemDel)){
									System.out.println("A postagem não foi encontrada");
									break;
								}
							System.out.println("Você tem certeza que deseja excluir a postagem: [1]Sim [2]Não");
							if (scanner.nextLine().equals("1")){
								facebook2.deletarPostagem(numeroPostagemDel);
							}
						}
						break;

					default:
						if (opcao.equals("6")) {
							facebook2.deslogar();
						}
						break;
				}
			}

		}while(repetir);


	}

	private static void loginUsuario(Scanner scanner, Facebook2 facebook2) {
		boolean repetir = true;
		while(repetir) {
			String email, senha;

			System.out.println("Digite suas informações");
			System.out.println("Digite seu email: ");
			email = scanner.nextLine();
			System.out.println("Digite sua senha: ");
			senha = scanner.nextLine();

			if (facebook2.login(email, senha)) {
				System.out.println("Login feito com sucesso");
				return;
			}
			else{
				System.out.println("Login não foi feita, talvez algum dado estivesse errado \n[1]tentar novamente [2]cancelar");
				String resp = scanner.nextLine();
				if (resp.equals("2")){
					repetir = false;
					break;
				}
			}
		}
	}

	private static void cadastrarUsuario(Scanner scanner, Facebook2 facebook2) {
		String nome, senha, email;
		boolean tipo = false;

		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		System.out.println("Digite seu email: ");
		email = scanner.nextLine();
		System.out.println("Digite sua senha: ");
		senha = scanner.nextLine();

		System.out.println("Gostaria de pagar R$20/mês para uma inscrição e um boost nos algoritimos?[1]Sim [2]Não");

		if (scanner.nextInt() == 1){tipo = true;}
		scanner.nextLine();

		facebook2.criarUsuario(nome, senha, email, tipo);
	}
}
