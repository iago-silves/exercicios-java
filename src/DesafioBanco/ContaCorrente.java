package DesafioBanco;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    // Rescrita do método sacar -> simplificar o método de aplicação de taxa:
    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.01;
        double total = valor + taxa;

        if (total > getSaldo()) {
            System.out.println("Saldo insuficiente para saque com taxa.");
        } else {
            super.sacar(total);
        }
    }
}

