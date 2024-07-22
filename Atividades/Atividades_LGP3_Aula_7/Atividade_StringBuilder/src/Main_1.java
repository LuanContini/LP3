import java.util.ArrayList;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {

        /*
    Criar um programa que usa StringBuilder para construir uma string a partir de um array de palavras.
         */

        String palavraAdicionar = "";
        ArrayList<String> arrayPalavras = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        StringBuilder strbdr = new StringBuilder();

        int i = 0;
        while(!palavraAdicionar.equals("-1")){
            System.out.println("Digite uma palavra [caso você queira sair digite -1]: ");
            palavraAdicionar = scanner.nextLine();

            if (!palavraAdicionar.equals("-1")){
                arrayPalavras.add(palavraAdicionar);
                i++;
            }


        }

        for(String palavra:arrayPalavras){
            strbdr.append(" "+ palavra);
        }

        System.out.println(strbdr.toString());
    }
}