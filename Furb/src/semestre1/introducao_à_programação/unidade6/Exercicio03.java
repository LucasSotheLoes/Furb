package semestre1.introducao_à_programação.unidade6;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double []vetor = new double[12];
		double []vetorAlterado = new double[12];
		System.out.println("Informe os 12 valores");
		for(int i = 0;i < vetor.length;i++) {
			vetor[i] = leitor.nextDouble();
			if(vetor[i] % 2 == 0)
				vetorAlterado[i] = vetor[i] * 1.02;
			else
				vetorAlterado[i] = vetor[i] * 1.05;
		}
		for(double resultado : vetorAlterado)
			System.out.println(resultado);
		leitor.close();
	}
}
