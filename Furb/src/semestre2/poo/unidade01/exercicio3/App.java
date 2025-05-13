package semestre2.poo.unidade01.exercicio3;

import java.util.Scanner;

import semestre2.poo.unidade01.exercicio1.Pessoa;

public class App {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
				
		for(int x = 0; x < 3; x++) {
			pessoas[x] = new Pessoa();
			
			pessoas[x].peso = leitor.nextDouble();
			pessoas[x].altura = leitor.nextDouble();
			
		
		System.out.println("O imc da pessoa é de: " + pessoas[x].calcularImc());
		}
		leitor.close();
	}
}
