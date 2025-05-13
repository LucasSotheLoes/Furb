package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma opção:");
        System.out.println("T - Área de um triângulo");
        System.out.println("Q - Área de um quadrado");
        System.out.println("R - Área de um retângulo");
        System.out.println("C - Área de um círculo");
        
        char opcao = scanner.next().charAt(0);
        double area;
        
        switch (opcao) {
            case 'T':
                System.out.println("Digite a base do triângulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Digite a altura do triângulo:");
                double alturaTriangulo = scanner.nextDouble();
                area = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("A área do triângulo é: " + area);
                break;
            case 'Q':
                System.out.println("Digite o lado do quadrado:");
                double ladoQuadrado = scanner.nextDouble();
                area = ladoQuadrado * ladoQuadrado;
                System.out.println("A área do quadrado é: " + area);
                break;
            case 'R':
                System.out.println("Digite a base do retângulo:");
                double baseRetangulo = scanner.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                double alturaRetangulo = scanner.nextDouble();
                area = baseRetangulo * alturaRetangulo;
                System.out.println("A área do retângulo é: " + area);
                break;
            case 'C':
                System.out.println("Digite o raio do círculo:");
                double raioCirculo = scanner.nextDouble();
                area = Math.PI * raioCirculo * raioCirculo;
                System.out.println("A área do círculo é: " + area);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha T, Q, R ou C.");
                break;
        }
        
        scanner.close();
    }
}
