import java.util.ArrayList;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        /*
        Desenvolver um programa que encontra o maior valor em um array de inteiros.
        */

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayInteiros = new ArrayList<Integer>();

        int a, pos, contador = 0, maior = -1;

        for(int i = 0; i < (int)(Math.random() * 15 + 5); i++){
            arrayInteiros.add((int)(Math.random() * 50 + 1));
        }

        do{
            a = arrayInteiros.get(contador);

            maior = Math.max(a, maior);
            contador++;
        }while(contador < arrayInteiros.size());

        pos = arrayInteiros.indexOf(maior);

        System.out.println("Array: "+arrayInteiros +"\nMaior: "+ maior);
    }
}
