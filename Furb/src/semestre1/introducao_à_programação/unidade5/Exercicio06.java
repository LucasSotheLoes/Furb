package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double alturaTotal = 0;
		double[]pessoas = new double[20];
		System.out.println("Informe a altura das 20 pessoas: ");
		for(int i = 0;i < pessoas.length;i++)
			pessoas[i] = scanner.nextDouble();
		for(int i = 0;i < pessoas.length;i++)
			alturaTotal += pessoas[i];
		
		double alturaMedia = alturaTotal / 20;
		System.out.printf("A média da altura das 20 pessoas é: %.2f: ", alturaMedia);
		scanner.close();
	}
}
