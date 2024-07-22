import java.util.HashMap;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        //Escrever um programa que armazena informações de contato (nome, telefone) e permite a busca por nome.

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> mapTelefones = new HashMap<>();

        int resposta;

        do {
            System.out.println("Qual ação você gostaria de tomar:\n[1]Adicionar Telefone");
            if (!mapTelefones.isEmpty()){
                System.out.println("[2]Visualizar Telefone\n[3]Procurar Telefone por Nome\n[4]Apagar Telefone");
            }
            System.out.println("[5]Sair");

            resposta = scanner.nextInt();
            scanner.nextLine();
            switch (resposta){
                case 1:
                    adicionarTelefone(mapTelefones);
                    break;
                case 2:
                    imprimirMap(mapTelefones);
                    break;
                case 3:
                    String nome;

                    System.out.println("Digite o nome do produto que deseja procurar: ");
                    nome = scanner.nextLine();

                    try{
                        System.out.println("Nome: "+ nome+ "\nValor: "+ mapTelefones.get(nome));

                    }catch (Exception ex){
                        System.out.println("O produto não foi encontrado");
                    }
                    break;
                case 4:
                    excluirTelefone(mapTelefones);
                    break;
            }


        }while(resposta != 5);
    }

    private static void excluirTelefone(HashMap<String, String> mapProdutos) {
        Scanner scanner = new Scanner(System.in);

        int resposta;
        do{
            String nome;

            System.out.println("Digite o nome do dono do telefone que deseja excluir: ");
            nome = scanner.nextLine();

            mapProdutos.remove(nome);

            System.out.println("Telefone excluido");
            System.out.println("(Para parar de excluir Telefone digite -1, caso contrário digite outro número): ");
            resposta = scanner.nextInt();
            scanner.nextLine();
        }while(resposta != -1);
    }

    private static void imprimirMap(HashMap<String, String> mapProdutos) {
        mapProdutos.forEach((key, value) -> {

            System.out.println("||Nome: "+key+"   Telefone: "+value);
        });
    }

    private static void adicionarTelefone(HashMap<String, String> mapProdutos) {
        Scanner scanner = new Scanner(System.in);
        int resposta;
        String nome;
        String telefone;

        do{
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite o Telefone: ");
            telefone = scanner.nextLine();

            mapProdutos.put(nome, telefone);

            System.out.println("Telefone adicionado");
            System.out.println("(Para parar de adicionar Telefones digite -1, caso contrário digite outro número)): ");
            resposta = scanner.nextInt();
            scanner.nextLine();
        }while(resposta != -1);
    }
    }

