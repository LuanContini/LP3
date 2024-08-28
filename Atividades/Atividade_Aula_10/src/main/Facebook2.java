package main;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import postagem.*;
import usuario.*;

public class Facebook2 {

	 private LinkedList<Comentario> listaComentarios = new LinkedList<>();

	private LinkedList<Postagem> listaPostagens = new LinkedList<>();

	private LinkedList<Usuario> listaUsuarios = new LinkedList<>();

	private Usuario usuario;

	public LinkedList<Postagem> getListaUsuarioPostagem(){
		return listaPostagens;
	}

	public LinkedList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public Usuario getUsuario(){
		return usuario;
	}

	public void adicionarUsuario(Usuario usuario){
		listaUsuarios.add(usuario);
	}

	public boolean criarUsuario(String nome, String senha, String email, boolean pagante){
		Usuario usuarioNovo;
		String tipo;

		if (nome.isBlank() || senha.isBlank() || email.isBlank()){return false;}

		if (pagante){tipo = "premium";}
		else {tipo = "comum";}

		usuarioNovo = new Usuario(nome, senha, email, tipo);
		listaUsuarios.add(usuarioNovo);
		this.usuario = usuarioNovo;
		return true;
	}

	public boolean login(String email, String senha){
		for(Usuario usuario: listaUsuarios){
			if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
				if (usuario.getBan() != null){
					System.out.println("Este usuário foi banido\nRazão:"+usuario.getBan().getRazao());
					return false;
				}
				this.usuario = usuario;
				return true;
			}
		}
		return false;
	}
	public void criarPostagem(String conteudo) {

		Postagem postagem = new Postagem(conteudo, usuario);

		if (usuario.getTipoUsuario().equals("premium")){listaPostagens.addFirst(postagem);}

		else {listaPostagens.add(postagem);}


	}

	public void criarPostagem(String conteudo, Usuario usuario) {

		Postagem postagem = new Postagem(conteudo, usuario);

		if (usuario.getTipoUsuario().equals("premium")){
			listaPostagens.addFirst(postagem);
		}
		else {
			listaPostagens.add(postagem);
		}


	}

	public boolean adicionarCurtida(int numeroPostagem){

		if(numeroPostagem > listaPostagens.size()){return false;}

		Postagem postagem = listaPostagens.get(numeroPostagem - 1);

		if (postagem == null){return false;}

		usuario.curtirPostagem(postagem);
		return true;
	}
	public boolean comentarPostagem(int numeroPostagem, String conteudo){

		if(numeroPostagem > listaPostagens.size()){return false;}

		Postagem postagem = listaPostagens.get(numeroPostagem - 1);
		Comentario comentario = new Comentario(conteudo ,postagem, usuario);

		listaComentarios.add(comentario);

		return true;
	}

	public void deslogar(){
		this.usuario = null;
	}



	public void imprimirPostagens(){
		int i = 0;
		for(Postagem postagem : listaPostagens){
			Usuario usuarioPostagem = postagem.getUsuario();

			if (usuarioPostagem.getBan() == null) {

				System.out.println("Postagem Nº " + (i + 1));
				System.out.println("Postagem de " + usuarioPostagem.getNome() + "\n" + postagem.getConteudo());
				System.out.println("Nº de comentários: " + postagem.getComentarios() + "|Nº de curtidas: " + postagem.getCurtidas() + "\nData: " + postagem.getDataPostagem());
				System.out.println("\n----------------------------------------------------------------\n");

				i++;
			}
		}
	}
	public boolean imprimirPostagens(int numeroPostagem){

		if(numeroPostagem > listaPostagens.size()){return false;}

		Postagem postagem = listaPostagens.get(numeroPostagem - 1);
		Usuario usuarioPostagem = postagem.getUsuario();


		if (usuarioPostagem.getBan() == null) {

			System.out.println("Postagem Nº " + (numeroPostagem));
			System.out.println("Postagem de " + usuarioPostagem.getNome() + "\n" + postagem.getConteudo());
			System.out.println("Nº de comentários: " + postagem.getComentarios() + "|Nº de curtidas: " + postagem.getCurtidas() + "\nData: " + postagem.getDataPostagem());
			System.out.println("\n----------------------------------------------------------------\n");

		}
		return true;
	}

	public boolean imprimirComentarios(int numeroPostagem){
		if(numeroPostagem > listaPostagens.size()){return false;}

		LinkedList<Comentario> listaComentarioPostagem = listaPostagens.get(numeroPostagem - 1).getListaComentario();
		int i = 0;

		imprimirPostagens(numeroPostagem);

		for (Comentario comentarioPostagem : listaComentarioPostagem){

			Usuario usuarioPostagem = comentarioPostagem.getUsuario();
			System.out.println("Comentário Nº "+ (i + 1));
			System.out.println("Comentário de: "+ usuarioPostagem.getNome() + "\n" +comentarioPostagem.getConteudo());
			System.out.println("Nº de curtidas: "+comentarioPostagem.getCurtidas());
			System.out.println("\n----------------------------------------------------------------\n");
		}
		return true;

	}

	public void imprimirUsuarios(){
		int i = 0;
		for(Usuario usuario : listaUsuarios){
			System.out.println("Nº "+(i + 1));
			System.out.println("Nome: " + usuario.getNome() + "\tEmail: "+usuario.getEmail());
			System.out.print("Tipo de usuário: "+usuario.getTipoUsuario()+"\nban: ");
			if (usuario.getBan() != null){
				System.out.print("sim\n");
				System.out.println("Razão: "+usuario.getBan().getRazao()+"\n\n");
			}
			else{
				System.out.print("não\n\n");
			}

			i++;
		}
	}
	public boolean imprimirUsuarios(int idUsuario){

		if (idUsuario > listaUsuarios.size()){return false;}

		Usuario usuario = listaUsuarios.get(idUsuario);
		System.out.println("Nº "+(idUsuario));
		System.out.println("Nome: " + usuario.getNome() + "\tEmail: "+usuario.getEmail());
		System.out.print("Tipo de usuário: "+usuario.getTipoUsuario()+"\nban: ");
		if (usuario.getBan() != null){
			System.out.print("sim\n");
			System.out.println("Razão: "+usuario.getBan().getRazao()+"\n\n");
		}
		else{
			System.out.print("não\n\n");
		}
		return true;

	}

	public boolean isAdmin(){
		return usuario.getTipoUsuario() == "admin";
	}
	public boolean banirUsuario(int idUsuario, String razao){
		if(idUsuario > listaUsuarios.size()){return false;}

		if (usuario.getTipoUsuario().equals("admin")){
			Usuario usuarioBan = listaUsuarios.get(idUsuario - 1);

			usuarioBan.setBan(new Banimento(razao, usuario));
			return true;
		}
		return false;
	}

	public void deletarPostagem(int numeroPostagem){
		listaPostagens.remove(numeroPostagem - 1);
	}
}
