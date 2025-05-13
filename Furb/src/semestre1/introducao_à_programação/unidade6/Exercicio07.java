package semestre1.introducao_à_programação.unidade6;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int n = 1, p = 1, menor, valor;
		while(p != 0) {
		System.out.println("Informe um numero inteiro menor que 20: ");
		n = leitor.nextInt();
		if(n <= 20 && n > 0) {
			int []vetor = new int[n];
			System.out.println("Informe " + n + " numero inteiros para preencher o vetor: ");
			for(int i = 0; i < vetor.length;i++) {
				valor = leitor.nextInt();
				for(int j = 0; j < vetor.length;j++) {
				if(i != j && valor == vetor[j]) {
					System.out.println("Já ha um valor identico no vetor! Escolha outro que ainda não esteja");
					valor = leitor.nextInt();
					} else 
						vetor[i] = valor;
				}
			}
			for(int i = 0; i < vetor.length - 1; i++) {
			    for(int j = 0; j < vetor.length - i - 1; j++) {
			        if(vetor[j] > vetor[j + 1]) {
			            menor = vetor[j + 1];
			            vetor[j + 1] = vetor[j];
			            vetor[j] = menor;
			        }
			    }
			}
			for(int valores : vetor)
				System.out.println("O vetor com os numeros ordenadas fica: " + valores);
			p = 0;
		} else 
			System.out.println("O valor de n é invalido");
		}
		leitor.close();
	}
}