package Atividade4;

public class Livro {

    int paginas;
    public Livro(int paginas){
        this.paginas = paginas;
    }
    public void lerPagina(int pagina){
        if (pagina > 0 && pagina < paginas){
            System.out.println("Lendo pagina");
        }
        else {
            if (pagina <= 0) throw new IndexOutOfBoundsException("Não foi possível ler a página, pois a pagina escolhida é menor ou igual a zero");
            else throw new IndexOutOfBoundsException("Não foi possível ler a página, pois a página excede o número de páginas do livro");
        }
    }
}
