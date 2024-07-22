import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {

        /*
         Criar um programa que calcula a hipotenusa de um triângulo retângulo dados os comprimentos dos catetos.
        */

        Scanner scanner = new Scanner(System.in);

        double catetoA, catetoB, hipotenusa;

        System.out.println("Digite o comprimento do primeiro cateto: ");
        catetoA = scanner.nextDouble();

        System.out.println("Digite o comprimento do segundo cateto: ");
        catetoB = scanner.nextDouble();

        hipotenusa = Math.sqrt((Math.pow(2, catetoA) + Math.pow(2, catetoB)));

        System.out.println("O valor da hipotenusa é de: "+ hipotenusa);
    }
}