package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double n1 = 0.0, n2 = 0.0, notaFinal = 0.0;
		String nome = "";
		while(true) {
			System.out.println("Informe o nome do aluno: ");
			nome = leitor.nextLine();
			if(nome.equalsIgnoreCase("fim")) 
			break;	
			System.out.println("Informe a Primeira nota do aluno: ");
			n1 = leitor.nextDouble();
			System.out.println("Informe a Segunda nota do aluno: ");
			n2 = leitor.nextDouble();
			notaFinal = (n1 + n2) /2 ;
			System.out.println("A média do aluno: " + nome + " é de: " + notaFinal);
		}
		leitor.close();
	}
}
