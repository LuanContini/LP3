package usuario;

import postagem.Postagem;

public class UsuarioAdmin extends Usuario{

    public UsuarioAdmin(String nome, String senha, String email){
        super(nome, senha, email, "admin");

    }
	
}
