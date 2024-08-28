package postagem;

import usuario.Usuario;

import java.util.Date;
import java.util.LinkedList;

public class Postagem implements Curtivel {

	private String conteudo;
	private Date dataPostagem;
	private int curtidas;
	private int comentarios;
	private Usuario usuario;
	private LinkedList<Comentario> listaComentario = new LinkedList<>();
	
	
	public Postagem(String conteudo, Usuario usuario) {
		this.conteudo = conteudo;
		this.dataPostagem = new Date();
		this.usuario = usuario;
		this.usuario.adicionarPostagem(this);
	}

	//getters e setters
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getDataPostagem() {
		return dataPostagem;
	}
	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public int getComentarios() {
		return comentarios;
	}
	public void setComentarios(int comentarios) {
		this.comentarios = comentarios;
	}

	public LinkedList<Comentario> getListaComentario (){return listaComentario;}
	public void setListaComentario(LinkedList<Comentario> listaComentario){this.listaComentario = listaComentario;}

	public Usuario getUsuario() {return usuario;}
	public void setUsuario(Usuario usuario) {this.usuario = usuario;}

	public int getCurtidas() {return curtidas;}
	public void curtir(){curtidas++;}


	public void comentar(Comentario comentario){
		listaComentario.add(comentario);
		comentarios++;
	}
	
}
