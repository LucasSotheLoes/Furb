package semestre2.poo.unidade01.exercicio4;

import java.util.Scanner;

import semestre2.poo.unidade01.exercicio1.Pessoa;

public class App {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
				
		for(int x = 0; x < 3; x++) {
			pessoas[x] = new Pessoa();
			pessoas[x].nome = leitor.next();
			pessoas[x].peso = leitor.nextDouble();
			pessoas[x].altura = leitor.nextDouble();
			
		
			System.out.printf("O IMC da pessoa %s é: %.1f%n", pessoas[x].nome, pessoas[x].calcularImc());
		}
		leitor.close();
	}
}
