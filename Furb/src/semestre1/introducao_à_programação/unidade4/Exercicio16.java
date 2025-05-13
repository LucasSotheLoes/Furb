package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] homens = new int[2];
        int[] mulheres = new int[2];
      
        System.out.println("Digite a idade do primeiro homem:");
        homens[0] = scanner.nextInt();
        System.out.println("Digite a idade do segundo homem:");
        homens[1] = scanner.nextInt();

        System.out.println("Digite a idade da primeira mulher:");
        mulheres[0] = scanner.nextInt();
        System.out.println("Digite a idade da segunda mulher:");
        mulheres[1] = scanner.nextInt();

        Arrays.sort(homens);
        Arrays.sort(mulheres);

        int soma = homens[1] + mulheres[0]; 
        int produto = homens[0] * mulheres[1]; 
        
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto);

        scanner.close();
    }
}
