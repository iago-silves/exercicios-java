package DesafioBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Definindo objeto scanner:
        Scanner input = new Scanner(System.in);

        //Criando lista para armazenar clientes:
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        //Variaveis:
        String opcao;
        String clienteNome;
        byte tipoConta;
        double valorSaldo;
        ContaBancaria novaConta;
        double valorDeposito;
        double valorSaque;

        while (true) {
            System.out.println("Menu:\n" + "1 - Cadastrar novo cliente\n" + "2 - Acessar conta existente\n" + "3 - Sair\n" + "Escolha a opção: ");
            opcao = input.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        System.out.println("Digite o nome do cliente: ");
                        clienteNome = input.nextLine();

                        System.out.println("Digite o saldo do cliente: ");
                        valorSaldo = input.nextDouble();

                        System.out.println("Tipos de conta em nosso banco:\n" + "1 - Conta correte\n" + "2 - Conta poupança\n" + "Escolha o tipo de conta:");
                        tipoConta = input.nextByte();

                        if (tipoConta == 1) {
                            novaConta = new ContaCorrente(clienteNome, valorSaldo);
                        } else {
                            novaConta = new ContaPoupanca(clienteNome, valorSaldo);
                        }
                        //Adicionando conta à array:
                        contas.add(novaConta);
                        System.out.println("Conta criada com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro. Tente novamente.");
                    }
                    input.nextLine();
                    break;
                case "2":
                    System.out.print("Digite o nome do cliente: ");
                    clienteNome = input.nextLine();

                    // Buscar conta do cliente
                    ContaBancaria contaEncontrada = null;
                    for (ContaBancaria conta : contas) {
                        if (conta.getcliente().equalsIgnoreCase(clienteNome)) {
                            contaEncontrada = conta;
                            break;
                        }
                    }

                    if (contaEncontrada == null) {
                        System.out.println("Conta não encontrada.");
                        continue;
                    }
                    while(true){
                        System.out.println("Menu cliente:\n" + "1 - Deposito\n" + "2 - Sacar\n" + "3 - Exibir dados\n" + "4 - Sair\n" + "Escolher opção: ");
                        opcao = input.nextLine();

                        switch (opcao) {
                            case "1":
                                try {
                                    System.out.print("Digite o valor para depósito: ");
                                    valorDeposito = input.nextDouble();
                                    input.nextLine(); 

                                    System.out.println("Depósito realizado com sucesso.");
                                    contaEncontrada.depositar(valorDeposito);
                                } catch (Exception e) {
                                    System.out.println("Ocorreu um erro. Tente novamente.");
                                }
                                break;
                            case "2":
                                try {
                                    System.out.print("Digite o valor para saque: ");
                                    valorSaque = input.nextDouble();
                                    input.nextLine();
                                    contaEncontrada.sacar(valorSaque);
                                } catch (Exception e) {
                                    System.out.println("Ocorreu um erro. Tente novamente.");
                                }
                                break;
                            case "3":
                                contaEncontrada.exibirDadosConta();
                                break;
                            case "4":
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                case "3":
                    System.out.println("Encerrando programa...");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

