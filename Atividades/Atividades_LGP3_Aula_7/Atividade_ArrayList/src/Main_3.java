import java.util.ArrayList;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        //Escrever um programa que encontra o maior e o menor valor em uma lista de números.

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayInteiros = new ArrayList<Integer>();

        int a, b, contador = 0, maior = -1, menor = 999999999;

        for(int i = 0; i < (int)(Math.random() * 20 + 5); i++){
            arrayInteiros.add((int)(Math.random() * 100 + 1));
        }

        do{
            a = arrayInteiros.get(contador);

            maior = Math.max(a, maior);
            menor = Math.min(a, menor);
            contador++;
        }while(contador < arrayInteiros.size());


        System.out.println("Array: "+arrayInteiros +"\nMaior: "+ maior+"\nMenor: "+menor);
    }
}
