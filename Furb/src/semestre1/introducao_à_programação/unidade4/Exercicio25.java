package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        
        int opcao = scanner.nextInt();
        double num1, num2, resultado;
        
        switch (opcao) {
            case 1:
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();
                resultado = num1 + num2;
                System.out.println("A soma é: " + resultado);
                break;
            case 2:
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();
                resultado = num1 - num2;
                System.out.println("A diferença é: " + resultado);
                break;
            case 3:
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();
                resultado = num1 * num2;
                System.out.println("O produto é: " + resultado);
                break;
            case 4:
                System.out.println("Digite o primeiro número (dividendo):");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número (divisor):");
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    System.out.println("Erro: O denominador não pode ser zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("A divisão é: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
                break;
        }
        
        scanner.close();
    }
}
