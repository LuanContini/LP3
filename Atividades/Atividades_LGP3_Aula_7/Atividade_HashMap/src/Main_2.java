import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main_2 {
    public static void main(String[] args) {
        /*
        Desenvolver um programa que conta a frequência de palavras em um texto.
        Escrever um programa que armazena informações de contato (nome, telefone) e permite a busca por nome.
        */

        Scanner scanner = new Scanner(System.in);
        //      palavra, frequencia
        HashMap<String, Integer> mapTexto = new HashMap<>();
        String[] palavras;

        String texto;


        System.out.println("Digite um texto para ser testado: ");
        texto = scanner.nextLine();

        palavras = texto.split(" ");

        for (String palavra: palavras){
            if(!mapTexto.isEmpty()) {
                mapTexto.put(palavra, mapTexto.getOrDefault(palavra, 0) + 1);
            }else {
                mapTexto.put(palavra, 1);
            }
        }

        mapTexto.forEach((key, value)->{
            System.out.println("Palavra: "+key+"-"+value+"x");
        });
    }
}
