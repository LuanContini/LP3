import java.io.*;

public class Main_2 {
    public static void main(String[] args) {
        /*
    Desenvolver um programa que copia o conteúdo de um arquivo para outro.
    */

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Main_Copia.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("Main_1.txt"));
            String line;
            while ((line = reader.readLine()) != null) {

                writer.write(line);
                writer.newLine();
            }
            writer.close();

            BufferedReader reader2 = new BufferedReader(new FileReader("Main_Copia.txt"));
            System.out.println("Main_Copia.txt\n");
            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
