package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int primeiroDia = 0, numeroDias = 0;

        System.out.println("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado):");
        primeiroDia = leitor.nextInt();

        System.out.println("Digite o número de dias que o mês possui:");
        numeroDias = leitor.nextInt();

        
        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

       
        for (int i = 1; i < primeiroDia; i++) {
            System.out.print("\t");
        }

       
        for (int i = 1; i <= numeroDias; i++) {
            System.out.print(i + "\t");

            if ((i + primeiroDia - 1) % 7 == 0) {
                System.out.println();
            }
        }

        leitor.close();
    }
}
