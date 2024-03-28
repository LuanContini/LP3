package Facil.Exercicio1;

public class Main {
    public static void main(String[] args) {
        /*
          Classe Calculadora Crie uma classe Calculadora com métodos para as quatro
          operações básicas: somar(), subtrair(), multiplicar() e dividir(). Cada
          método deve receber dois parâmetros e retornar o resultado da operação. Crie um
          objeto da classe Calculadora e teste os métodos.
        */

        Calculadora calculadora = new Calculadora();

        System.out.println("Soma: 3 + 4 = "+ calculadora.somar(3, 4));
        System.out.println("Subtração: 4 - 5.6 = "+ calculadora.subtrair(4, 5.6));
        System.out.println("Divisão: 5.3 - 5 = "+ calculadora.dividir(5.3, 5));
        System.out.println("Multiplicação: 2.5 - 15 = "+ calculadora.multiplicar(2.5, 15));

    }
}
