package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double []valores = new double[2];
        System.out.println("Digite as horas trabalhadas no mês e o valor recebido por hora:");
        for(int i = 0;i <= 1;i++) {
        valores[i] = leitor.nextDouble();	
        }
        double salarioTotal = valores[0] * valores[1];
        if (valores[0] > 160) {
        	double salarioExtra = (valores[0] - 160) * (valores[1] /2);
        	salarioTotal = salarioTotal + salarioExtra;
        } 
        
        System.out.println("O salário total é de: " + salarioTotal);
        leitor.close();
        
    }
}
