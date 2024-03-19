package Atividade2;

import Atividade2.Floresta.*;
import Atividade2.SalaMusica.*;

public class Main {
    public static void main(String[] args) {
        Planta planta = new Planta();
        Arvore arvore = new Arvore();
        Flor flor = new Flor();

        System.out.println("1)\n");

        planta.fotossintese();
        arvore.fotossintese();
        flor.fotossintese();

        System.out.print("2)\n\n");

        Piano piano = new Piano();
        Violao violao = new Violao();

        System.out.print("Piano: \n");
        piano.afinar();
        piano.tocar();

        System.out.print("Violão: \n");
        violao.afinar();
        violao.tocar();
    }
}
