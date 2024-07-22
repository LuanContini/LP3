import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        /*
    Escrever um programa que insere uma string em outra string em uma posição específica usando StringBuilder.
    */

        Scanner scanner = new Scanner(System.in);
        StringBuilder strbdr = new StringBuilder();

        String palavra, palavraParaInserir;
        int posicao = 0;

        System.out.println("Digite uma palavra: ");
        palavra = scanner.nextLine();
        strbdr.append(palavra);

        System.out.println("Digite uma palavra para inserir: ");
        palavraParaInserir = scanner.nextLine();

        System.out.println("Digite a posição que deseja inserir a palavra: ");

        do{
            if (posicao > palavra.length()){
                System.out.println("Posição desejada é maior que a quantidade de letras na palavra, tente novamente: ");
            }
            posicao = scanner.nextInt() - 1;
        }while(posicao > palavra.length());

        strbdr.insert(posicao, palavraParaInserir);

        System.out.println("As palavra ficaram: " + strbdr.toString());
    }

}
