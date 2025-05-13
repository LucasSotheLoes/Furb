package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a coordenada X do ponto:");
        int x = scanner.nextInt();
        
        System.out.println("Digite a coordenada Y do ponto:");
        int y = scanner.nextInt();
        
        int quadrante;
        
        if (x == 0 && y == 0) {
            quadrante = 0;
        } else if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x > 0 && y < 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else {
            quadrante = 4;
        }
        
        System.out.println("O ponto está localizado no quadrante: " + quadrante);
        
        scanner.close();
    }
}
