package Atividade3;

import Atividade3.Sala.*;

public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        Computador computador = new Computador();

        televisao.ligar();
        televisao.desligar();

        computador.ligar();
        computador.desligar();
    }
}
