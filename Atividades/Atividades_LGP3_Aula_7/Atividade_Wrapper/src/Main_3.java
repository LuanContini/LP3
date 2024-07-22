import java.util.ArrayList;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        //Criar um programa que lê uma string de números e retorna a soma total.

        ArrayList<String> listaString = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String resposta;
        int soma = 0, num;

        do{
            System.out.println("Digite um número inteiro[Digite -1 para parar]:");
            resposta = scanner.nextLine();

            try{
                num = Integer.parseInt(resposta);

                if(!resposta.equals("-1")){
                    listaString.add(resposta);
                }
            }catch (Exception e) {
                System.out.println("O valor deve ser de um inteiro, tente novamente");
            }
        }while(!resposta.equals("-1"));

        for (String numero:listaString){
            soma += Integer.parseInt(numero);
        }

        System.out.println(" Soma: "+ soma+"\nLista Strings: " + listaString);
    }
}
