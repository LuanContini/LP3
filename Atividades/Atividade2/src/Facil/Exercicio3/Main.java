package Facil.Exercicio3;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("A volta dos que não foram", "Marcelo Braga", "1992");
        Livro livro2 = new Livro("Os ultimos cabelos do careca", "Nico Revel", "2003");

        livro1.imprimirDetalhes();
        livro2.imprimirDetalhes();
    }
}
