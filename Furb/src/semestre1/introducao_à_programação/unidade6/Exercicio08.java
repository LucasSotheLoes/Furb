package semestre1.introducao_à_programação.unidade6;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);

        double vetor[];

        System.out.println("Digite um número entre 1 e 20");
        int tamanhoVetor = leitor.nextInt();

        if (tamanhoVetor < 1 || tamanhoVetor > 20) 
            System.out.println("Número digitado inválido!");
        
        else {
            vetor = new double[tamanhoVetor];

            for (int i = 0; i < vetor.length; i++) 
                vetor[i] = leitor.nextDouble();

            double vetorFinal[][] = new double[tamanhoVetor][2];
            int contadorOcorrencias = 0;
            int quantNumDiferentes = 0;

            for (int i = 0; i < vetor.length; i++) {
                double valorAtual = vetor[i];
                contadorOcorrencias = 0;
                for (int j = i; j < vetor.length; j++) {
                    if (vetor[j] == valorAtual && valorAtual != Double.MAX_VALUE) {
                        contadorOcorrencias++;
                        vetor[j] = Double.MAX_VALUE;
                    }
                }
                if (contadorOcorrencias > 0) {
                    vetorFinal[quantNumDiferentes][0] = valorAtual;
                    vetorFinal[quantNumDiferentes][1] = contadorOcorrencias;
                    quantNumDiferentes++;
                }
            }

            System.out.println("VALOR\tFREQUENCIA");
            for (int k = 0; k < quantNumDiferentes; k++) 
                System.out.printf("%.1f\t%.0f\n",vetorFinal[k][0],vetorFinal[k][1]);
        }

		leitor.close();
	}
}
