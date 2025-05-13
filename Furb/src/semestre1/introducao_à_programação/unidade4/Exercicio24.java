package semestre1.introducao_à_programação.unidade4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[3];

        System.out.println("Digite o primeiro valor:");
        valores[0] = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        valores[1] = scanner.nextInt();
        System.out.println("Digite o terceiro valor:");
        valores[2] = scanner.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                Arrays.sort(valores);
                System.out.println("Valores em ordem crescente: " + Arrays.toString(valores));
                break;
            case 2:
                Arrays.sort(valores);
                System.out.println("Valores em ordem decrescente: " + valores[2] + ", " + valores[1] + ", " + valores[0]);
                break;
            case 3:
                Arrays.sort(valores);
                System.out.println("Valores com o maior no meio: " + valores[1] + ", " + valores[2] + ", " + valores[0]);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                break;
        }

        scanner.close();
    }
}
