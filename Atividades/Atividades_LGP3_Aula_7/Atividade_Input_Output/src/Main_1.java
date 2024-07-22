import java.io.*;

public class Main_1 {
    public static void main(String[] args) {

        /*
    Criar um programa que lê um arquivo de texto linha por linha e imprime o conteúdo no console.
    */

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Main_1.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}