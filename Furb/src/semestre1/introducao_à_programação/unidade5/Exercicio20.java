package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[]args){
		Scanner leitor = new Scanner(System.in);
		int tempo = 0;
		double massaInicial = 0, massa = 0, massaFinal = 1;
		System.out.println("Informe a massa inicial em Kgs: ");
		massaInicial = leitor.nextDouble();
		massa = massaInicial * 1000;
		while(massa > 0.5) {
			massa /= 2;
			tempo+= 50;
		}
		System.out.println("A massa inicial é de: " + massaInicial + " a massa final é de: " + massa + " e o tempo foi de: " + tempo);
		
		leitor.close();
	}
}