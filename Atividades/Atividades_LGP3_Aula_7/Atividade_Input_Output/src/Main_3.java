import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        //Escrever um programa que grava um array de strings em um arquivo, com cada string em uma nova linha.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayStrings = new ArrayList<String>();
        String resposta, line;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Main_3.txt"));


            do {
                System.out.println("Digite uma palavra(Para parar digite -1): ");
                resposta = scanner.nextLine();

                if (!resposta.equals("-1")){
                    arrayStrings.add(resposta);
                }

            } while (!resposta.equals("-1"));

            for(String palavra:arrayStrings){
                writer.write(palavra);
                writer.newLine();
            }
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("Main_3.txt"));
            System.out.println("Main_3.txt\n");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
