package semestre1.introducao_à_programação.unidade6;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int []vetor = new int[6];
		int soma = 0;
		double media;
		System.out.println("Informe 12 valores inteiros");
		for(int i = 0; i < vetor.length;i++) {
			vetor[i] = leitor.nextInt();
			soma += vetor[i];
		}
		media = soma / vetor.length;
		System.out.println("Os valores maiores que a media são: ");
		for(int valor : vetor) {
			if(valor > media) {
				System.out.println(valor);
			}
		}
		leitor.close();
	}
}
