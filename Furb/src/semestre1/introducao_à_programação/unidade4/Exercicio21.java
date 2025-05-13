package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a massa do indivíduo (em quilogramas):");
        double massa = scanner.nextDouble();
        
        System.out.println("Digite a altura do indivíduo (em metros):");
        double altura = scanner.nextDouble();
        
        double imc = massa / (altura * altura);
        
        String classificacao;
        
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 24.9) {
            classificacao = "Saudável";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 39.9) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }
        
        System.out.printf("O IMC calculado é: %.2f\n", imc);
        System.out.println("A classificação é: " + classificacao);
        
        scanner.close();
    }
}
