package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = 0, K = 0, M = 0, somaDentro = 0, somaFora = 0, atual = N;
        String dentro = "", fora = "";

        System.out.println("Digite o valor inicial N:");
        N = leitor.nextInt();

        System.out.println("Digite o decremento K:");
        K = leitor.nextInt();

        System.out.println("Digite o tamanho da mochila M:");
        M = leitor.nextInt();

        while (atual > 0) {
            if (somaDentro + atual <= M) {
                somaDentro += atual;
                dentro += atual + " ";
            } else {
                somaFora += atual;
                fora += atual + " ";
            }
            atual -= K;
        }

        System.out.println("Elementos a serem colocados na mochila: " + dentro);
        System.out.println("Elementos que entraram na mochila: " + dentro);
        System.out.println("Elementos que ficaram fora da mochila: " + fora);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaDentro);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaFora);

        leitor.close();
    }
}
