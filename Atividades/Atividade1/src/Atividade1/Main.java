package Atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();
        Random rd = new Random();

        for(int i = 0; i < 5; i++) lista.add(rd.nextInt(0, 100));

        System.out.println("1) \n\n"+ lista);

        List<String> listaCompras = new ArrayList<String>();


        System.out.println("\n\n2) ");

        listaCompras.add("Banana");
        listaCompras.add("Chocolate");
        listaCompras.add("Arroz");
        listaCompras.add("Carne");
        listaCompras.add("Abacaxi");

        for (String item : listaCompras){
            System.out.printf(" \n" + item);
        }

        int remover = rd.nextInt(0, 4);

        System.out.println("\n\n");
        System.out.println("O item removido foi: " + listaCompras.get(remover));

        listaCompras.remove(remover);

        for (String item : listaCompras){
            System.out.printf(" \n" + item);
        }
    }
}
