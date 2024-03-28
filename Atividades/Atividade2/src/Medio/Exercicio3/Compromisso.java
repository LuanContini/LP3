package Medio.Exercicio3;

public class Compromisso {
    String data, hora, descricao;

    public Compromisso(String data, String hora, String descricao){
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    public void imprimeCompromisso(){
        System.out.println("\nData: " +data+ " Hora: " +hora+ "\nDescrição:\n" + descricao);
    }

    public String getData(){
        return data;
    }
}
