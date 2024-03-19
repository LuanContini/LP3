package Atividade3.Sala;

public class Televisao implements DispositivoEletronico{
    public void ligar() {
        System.out.println("A "+ getClass().getSimpleName() + " foi ligada");
    }

    public void desligar() {
        System.out.println("A " + getClass().getSimpleName() + " foi desligada");
    }
}
