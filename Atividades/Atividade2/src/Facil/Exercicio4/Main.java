package Facil.Exercicio4;

public class Main {
    public static void main(String[] args) {

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
