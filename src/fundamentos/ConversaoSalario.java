package fundamentos;

import java.util.Scanner;

public class ConversaoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double valorSalario = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite seu salário: ");
            String salarioStr = input.nextLine().replace(",", "."); 

            try {
                double salario = Double.parseDouble(salarioStr);
                valorSalario += salario;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
                i--;
            }
        }

        System.out.println("A média dos salários digitados: R$" + valorSalario / 3);
        input.close();
    }
}
