package semestre1.introducao_à_programação.unidade6;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int []vetor1 = new int[10];
		int []vetor2 = new int[10];
		int []vetor3 = new int[10];
		
		System.out.println("Informe 10 números inteiros: ");
		for(int i = 0; i < vetor1.length;i++) 
			vetor1[i] = leitor.nextInt();
		
		System.out.println("Informe 10 números inteiros: ");
		for(int i = 0; i < vetor2.length;i++) 
			vetor2[i] = leitor.nextInt();
		
		for(int i = 0; i < vetor3.length;i++)
			vetor3[i] = vetor1[i] + vetor2[i];
		System.out.println("A soma dos valores contididos na possições dos vetores são: ");
		for(int valores : vetor3)
			System.out.println(valores);
		leitor.close();
	}
}