package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número inteiro positivo:");
        numero = leitor.nextInt();

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.println(numero + "\t" + i);
                numero /= i;
            }
        }

        leitor.close();
    }
}
