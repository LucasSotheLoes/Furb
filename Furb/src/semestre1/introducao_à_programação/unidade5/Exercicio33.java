package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int voto, totalVotos = 0, totalNulos = 0, totalBrancos = 0,
        candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;

        do {
            System.out.println("Informe o seu voto:");
            voto = leitor.nextInt();

            if (voto == 1) {
                candidato1++;
                totalVotos++;
            } else if (voto == 2) {
                candidato2++;
                totalVotos++;
            } else if (voto == 3) {
                candidato3++;
                totalVotos++;
            } else if (voto == 4) {
                candidato4++;
                totalVotos++;
            } else if (voto == 5) {
                totalNulos++;
                totalVotos++;
            } else if (voto == 6) {
                totalBrancos++;
                totalVotos++;
            } else if (voto != 0) {
                System.out.println("Opção incorreta");
            }
        } while (voto != 0);

        System.out.println("Total de votos para o candidato 1: " + candidato1);
        System.out.println("Total de votos para o candidato 2: " + candidato2);
        System.out.println("Total de votos para o candidato 3: " + candidato3);
        System.out.println("Total de votos para o candidato 4: " + candidato4);
        System.out.println("Total de votos nulos: " + totalNulos);
        System.out.println("Total de votos em branco: " + totalBrancos);

        double percentualNulos = ((double) totalNulos / totalVotos) * 100;
        double percentualBrancos = ((double) totalBrancos / totalVotos) * 100;

        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
    leitor.close();
    }
}
