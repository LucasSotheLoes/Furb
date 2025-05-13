package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a renda anual do contribuinte:");
        double rendaAnual = scanner.nextDouble();
        
        System.out.println("Digite o número de dependentes do contribuinte:");
        int numeroDependentes = scanner.nextInt();
        
       
        double rendaLiquida = rendaAnual * (1 - 0.02 * numeroDependentes);
        
        
        double impostoDevido;
        if (rendaLiquida <= 2000) {
            impostoDevido = 0;
        } else if (rendaLiquida <= 5000) {
            impostoDevido = rendaLiquida * 0.05;
        } else if (rendaLiquida <= 10000) {
            impostoDevido = rendaLiquida * 0.10;
        } else {
            impostoDevido = rendaLiquida * 0.15;
        }
        
        System.out.printf("O imposto de renda devido é: R$ %.2f\n", impostoDevido);
        
        scanner.close();
    }
}

