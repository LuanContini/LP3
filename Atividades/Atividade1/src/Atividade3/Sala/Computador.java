package Atividade3.Sala;

public class Computador implements DispositivoEletronico{

    public void ligar() {
        System.out.println("O "+ getClass().getSimpleName() + " foi ligado");
    }

    public void desligar() {
        System.out.println("O " + getClass().getSimpleName() + " foi desligado");
    }
}
