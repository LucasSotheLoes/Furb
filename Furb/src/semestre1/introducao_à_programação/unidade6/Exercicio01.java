package semestre1.introducao_à_programação.unidade6;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int []vetor = new int[10];
		System.out.println("Informe 10 valores inteiros");
		for(int i = 0; i < vetor.length;i++) {
			vetor[i] = leitor.nextInt();
		}
		for(int i = 9; i >= 0;i--) {
			System.out.println(vetor[i]);
		}
		
		leitor.close();
	}
}
