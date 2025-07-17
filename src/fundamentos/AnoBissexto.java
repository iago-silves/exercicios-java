package fundamentos;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano que deseja verificar se é bissexto: ");

        if (sc.hasNextInt()) {
            int ano = sc.nextInt();
            String resultado;

            if (ano % 4 == 0) {
                if (ano % 100 == 0) {
                    if (ano % 400 == 0) {
                        resultado = "Bissexto";
                    } else {
                        resultado = "Não é Bissexto";
                    }
                } else {
                    resultado = "Bissexto";
                }
            } else {
                resultado = "Não é Bissexto";
            }

            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Erro: Digite um ano válido.");
        }

        sc.close();
    }
}
