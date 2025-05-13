package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double limite,peixe = 0, peixeTotal = 0;
		String continuar = "s";
		System.out.println("Informe o limite diario de peixes em Kg");
		limite = leitor.nextDouble();
		limite *= 1000;
		while(continuar.equalsIgnoreCase("s")) {
			System.out.println("Informe o peso do peixe em gramas: ");
			peixe = leitor.nextDouble();
			peixeTotal += peixe;
			System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
			continuar = leitor.next();
			if(peixeTotal > limite) {
				System.out.println("O limite foi atintingido");
				continuar = "n";
			}
		}
		
		leitor.close();
	}
}