package usuario;

import postagem.Postagem;

public class UsuarioPremium extends Usuario{

    public UsuarioPremium(String nome, String senha, String email){
        super(nome, senha, email, "premium");
    }

}
