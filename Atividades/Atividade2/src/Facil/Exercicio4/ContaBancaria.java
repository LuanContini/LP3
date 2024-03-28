package Facil.Exercicio4;

public class ContaBancaria {
    /*
    Classe ContaBancaria Crie uma classe ContaBancaria com os atributos
    numeroDaConta e saldo. A classe deve ter métodos para depositar(),
    sacar() e verSaldo(). O método depositar() deve adicionar o valor ao saldo,
    o método sacar() deve subtrair o valor do saldo e o método verSaldo() deve
    imprimir o saldo atual. Crie um objeto da classe ContaBancaria e teste os
    métodos.
            */
    String numeroDaConta;
    double saldo;
    
    public ContaBancaria(String numeroDaConta, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            System.out.println("Depositando R$ "+ valor);
            saldo += valor;
            verSaldo();
        }
        else System.out.println("O valor de depósito deve ser maior que 0");
    }

    public void sacar(double valor){
        if(valor < saldo){
            System.out.println("Sacando R$ "+ valor);
            saldo -= valor;
            verSaldo();
        }
        else System.out.println("O valor que você deseja sacar é maior que o total em sua conta");
    }

    public void verSaldo(){
        System.out.println("Saldo: "+saldo);
    }
}
