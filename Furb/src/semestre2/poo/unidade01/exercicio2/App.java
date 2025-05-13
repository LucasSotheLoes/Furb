package semestre2.poo.unidade01.exercicio2;

import java.util.Scanner;

import semestre2.poo.unidade01.exercicio1.Pessoa;

public class App {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		Pessoa pessoa2 = new Pessoa();
		pessoa2.peso = leitor.nextDouble();
		pessoa2.altura = leitor.nextDouble();
		
		System.out.println("O imc da pessoa é de: " + pessoa2.calcularImc());
	
		leitor.close();
	}
}
