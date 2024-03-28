package Medio.Exercicio2;


public class Main {
    public static void main(String[] args) {
        /*
        Classe Conta Bancária com Exceções Modifique a classe ContaBancaria do
            exercício anterior para lançar uma exceção personalizada
        SaldoInsuficienteException quando uma tentativa de saque é feita, mas o
        saldo é insuficiente. Teste a classe com um programa que tente fazer um saque
        maior que o saldo disponível.
        */

        ContaBancaria contaBancaria1 = new ContaBancaria("1234", 1000);

        contaBancaria1.verSaldo();
        contaBancaria1.depositar(1500);
        contaBancaria1.sacar(1000);

        contaBancaria1.sacar(30000);
        contaBancaria1.verSaldo();

        contaBancaria1.depositar(-1500);
        contaBancaria1.verSaldo();

    }
}
