package DesafioBanco;

public class ContaBancaria {
    // Variáveis:
    private String cliente;
    private double saldo;

    //Construtor:
    public ContaBancaria(String cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    // Métodos:
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo <= 0) {
            System.out.println("Sua conta encontra-se zerada.");
        } else if (valor > this.saldo) {
            System.out.println("O saldo em sua conta é insuficiente para saque.");
        } else {
            System.out.println("Saque realizado com sucesso.");
            this.saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getcliente(){
        return cliente;
    }

    public void exibirDadosConta() {
        System.out.println("---- Dados da conta bancária do cliente ----");
        System.out.println("Nome: " + this.cliente + " | Saldo: R$ " + this.saldo);
    }
    
}
