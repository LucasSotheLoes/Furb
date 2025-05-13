package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário atual do funcionário:");
        double salario = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de meses que o funcionário foi admitido:");
        int mesesAdmissao = scanner.nextInt();
        
        double reajuste;
        
        if (mesesAdmissao <= 12) {
            reajuste = salario * 0.05; 
        } else if (mesesAdmissao <= 48) {
            reajuste = salario * 0.07; 
        } else {
            reajuste = 0; 
            System.out.println("Não há reajuste para funcionários admitidos há mais de 48 meses.");
        }
        
        System.out.printf("O valor de reajuste é: R$ %.2f\n", reajuste);
        
        scanner.close();
    }
}
