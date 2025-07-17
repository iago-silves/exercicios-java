package fundamentos;

import java.util.Scanner;

public class AteDezPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 10: ");

        if (input.hasNextInt()) {
            int num1 = input.nextInt();

            if (num1 >= 0 && num1 <= 10) {
                if (num1 % 2 == 0) {
                    System.out.println(num1 + " é par.");
                } else {
                    System.out.println(num1 + " é ímpar.");
                }
            } else {
                System.out.println("O número digitado não está entre 0 e 10.");
            }
        } else {
            System.out.println("Erro: Digite um número válido.");
        }

        input.close();
    }
}

