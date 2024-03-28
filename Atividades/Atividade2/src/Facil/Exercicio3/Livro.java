package Facil.Exercicio3;

import java.util.Date;

public class Livro {
    /*
        Classe Livro Crie uma classe Livro com os atributos titulo, autor e
        anoDePublicacao. Adicione um método imprimirDetalhes() que imprime
        todos os detalhes do livro. Crie um objeto da classe Livro, atribua valores aos
        atributos e chame o método imprimirDetalhes().
        */

    String titulo, autor,  anoDePublicacao;


    public Livro(String titulo, String autor, String anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void imprimirDetalhes(){
        System.out.println("\nTitulo: "+titulo+"\nAutor: "+autor+"\nAno de publicação: "+anoDePublicacao);
    }
}
