package usuario;

import java.util.HashMap;
import java.util.LinkedList;
import postagem.Postagem;
import postagem.Comentario;

public class Usuario {

	private String nome;
	private String senha;
	private String email;
	private String tipoUsuario;
	private Banimento ban = null;
	protected LinkedList<Postagem> listaPostagem = new LinkedList<>();
	private HashMap<Comentario, Postagem> listaComentarioPostagem = new HashMap<>();

	public Usuario(String nome, String senha, String email, String tipoUsuario){
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.tipoUsuario = tipoUsuario;
	}

	public Usuario(String nome, String senha, String email){
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.tipoUsuario = "comum";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Banimento getBan() {
		return ban;
	}

	public void setBan(Banimento ban) {
		this.ban = ban;
	}

	public void adicionarPostagem(Postagem postagem){
		listaPostagem.add(postagem);
	}

	public void curtirPostagem(Postagem postagem){
		postagem.curtir();
	}

}
