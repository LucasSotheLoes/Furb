package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int numeroInscricao = 1, numeroAtletaMaior = 0, numeroAtletaMenor = 0,quantidadeInscritos = 0;
		double altura = 0, maiorAltura = 0, menorAltura = Double.MAX_VALUE, alturaTotal = 0, alturaMedia;
		while(numeroInscricao != 0) {
			System.out.println("Informe o numero de inscricao do atleta: ");
			numeroInscricao = leitor.nextInt();
			if(numeroInscricao != 0) {
			System.out.println("Informe a altura do atleta: ");
			altura = leitor.nextDouble();
			alturaTotal += altura;
			if(altura < menorAltura) {
				menorAltura = altura;
				numeroAtletaMenor = numeroInscricao;
			}
			else if(altura > maiorAltura) {
				maiorAltura = altura;
				numeroAtletaMaior = numeroInscricao;
				}
			}	
			quantidadeInscritos++;
		}
		alturaMedia = alturaTotal / quantidadeInscritos;
		System.out.println("O numero do menor atleta: " + numeroAtletaMenor + " e sua altura é de: " + menorAltura);
		System.out.println("O numero do maior atleta: " + numeroAtletaMaior + " e sua altura é de: " + maiorAltura);
		System.out.printf("A altura média é de: %f0.00", alturaMedia );
		leitor.close();
	}
}