package DesafioBanco;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void depositar(double valor) {
        double juros = getSaldo() * 0.05; 
        depositar(juros); 
    }
    // Método para redimentos na poupança:
    public void renderJuros() {
        double juros = getSaldo() * 0.05; 
        depositar(juros); 
    }
}
