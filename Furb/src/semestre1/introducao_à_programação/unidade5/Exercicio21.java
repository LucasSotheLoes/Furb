package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int anos = 0;
		double chico = 1.5, ze = 1.1;
		while(chico > ze) {
			chico += 0.02;
			ze += 0.03;
			anos++;
		}
		System.out.println("A quantidade de anos que são necessarios para zé ser maior que chico é de: " + anos);
		leitor.close();
	}
}
