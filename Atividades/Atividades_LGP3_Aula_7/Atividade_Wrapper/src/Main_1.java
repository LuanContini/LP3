import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {

        //Converter uma lista de strings em uma lista de inteiros.

        ArrayList<String> listaString = new ArrayList<String>();
        ArrayList<Integer> listaInteger = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String resposta;
        Integer num;

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
            listaInteger.add(Integer.parseInt(numero));
        }

        System.out.println(" Lista Strings: "+ listaString+"\nLista Inteiros: "+listaInteger);
    }
}