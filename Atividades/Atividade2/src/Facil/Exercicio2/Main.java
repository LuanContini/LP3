package Facil.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("João", 15, 10);
        Estudante estudante2 = new Estudante("Marcos", 15, 6.5);
        Estudante estudante3 =new Estudante("Nicolas", 16, 7);

        System.out.println("Estudante: "+estudante1.nome+" | Aprovado: "+estudante1.aprovado());
        System.out.println("Estudante: "+estudante2.nome+" | Aprovado: "+estudante2.aprovado());
        System.out.println("Estudante: "+estudante3.nome+" | Aprovado: "+estudante3.aprovado());
    }
}
