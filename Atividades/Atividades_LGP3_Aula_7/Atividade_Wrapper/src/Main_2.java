import java.util.ArrayList;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        //Desenvolver um programa que calcula a soma e a média de uma lista de números inteiros.

        ArrayList<Integer> listaInteiros = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        int resposta, media = 0, soma = 0, contador = 0;


        do{
            System.out.println("Digite um número inteiro[Digite -1 para parar]:");
            resposta = scanner.nextInt();

            if (resposta != -1){
                listaInteiros.add(resposta);
            }

        }while(resposta != -1);

        for (Integer numero:listaInteiros){
            soma += numero;

            contador++;
        }

        media = soma / contador;

        System.out.println("Soma: "+soma+"\nMédia: "+media+"\nLista: "+listaInteiros);

    }
}
