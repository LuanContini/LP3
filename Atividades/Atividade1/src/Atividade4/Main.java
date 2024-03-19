package Atividade4;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(250);
        try {
            livro.lerPagina(15);

        }catch(IndexOutOfBoundsException exception){
            System.out.println(exception);
        }

        try {
            livro.lerPagina(300);

        }catch(IndexOutOfBoundsException exception){
            System.out.println(exception);
        }

        try {
            livro.lerPagina(-1);

        }catch(IndexOutOfBoundsException exception){
            System.out.println(exception);
        }



    }
}
