package fundamentos;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Digite um número válido.");
            sc.close();
            return;
        }
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Erro: Digite um número válido.");
            sc.close();
            return;
        }
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        String resultado;

        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media > 4) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
