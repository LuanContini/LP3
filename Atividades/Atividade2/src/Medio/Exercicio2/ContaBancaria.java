package Medio.Exercicio2;

public class ContaBancaria {
    /*
    Classe Conta Bancária com Exceções Modifique a classe ContaBancaria do
            exercício anterior para lançar uma exceção personalizada
        SaldoInsuficienteException quando uma tentativa de saque é feita, mas o
        saldo é insuficiente. Teste a classe com um programa que tente fazer um saque
        maior que o saldo disponível.
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
        try {
            if (valor < saldo) {
                System.out.println("Sacando R$ " + valor);
                saldo -= valor;
                verSaldo();
            } else throw new SaldoInsuficienteException("Saldo insuficiente");
        }catch (SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void verSaldo(){
        System.out.println("Saldo: "+saldo);
    }
}
