import java.util.ArrayList;
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {
        /*
         Desenvolver um programa que remove todas as vogais de uma string usando StringBuilder.
        */

        Scanner scanner = new Scanner(System.in);
        StringBuilder strbdr = new StringBuilder();

        String palavra;
        ArrayList<Integer> posicoes = new ArrayList<Integer>();
        char[] charArray;
        int contadorChar = 0;

        System.out.println("Digite uma palavra: ");
        palavra = scanner.nextLine();

        charArray = palavra.toCharArray();

        strbdr.append(palavra);

        for (char letra:charArray){
            if (letra == 'a' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'e'){
                posicoes.add(contadorChar);
            }
            contadorChar++;
        }

        for (int i = posicoes.size(); i > 0; i--){
            strbdr.deleteCharAt(posicoes.get(i - 1));
        }

        System.out.println("A palavra sem vogais: " + strbdr.toString());
    }
}
