package postagem;

import java.util.Date;
import usuario.Usuario;

public class Comentario implements Curtivel{

	private String conteudo;
	private Postagem postagem;
	private Date data;
	private int curtidas = 0;
	private Usuario usuario;

	public Comentario(String conteudo, Postagem postagem, Usuario usuario){
		this.conteudo = conteudo;
		this.postagem = postagem;
		this.postagem.comentar(this);
		this.usuario = usuario;
		data = new Date();
	}
	
	@Override
	public void curtir() {
		this.curtidas++;
	}
	
	@Override
	public int getCurtidas() {
		return curtidas;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
