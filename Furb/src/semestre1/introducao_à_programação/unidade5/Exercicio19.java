package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double compra = 1,totalCompra = 0;
		while(compra != 0) {
			System.out.println("Informe o valor da compra: ");
			compra = leitor.nextDouble();
			if(compra != 0) {
			if(compra > 500)
				compra = compra * 0.8;
			else if(compra <= 500)
				compra = compra * 0.85;
			System.out.println("O valor total a pagar nesta compra é de: " + compra);
			totalCompra += compra;
			}
		}
		System.out.println("O valor total vendido no dia é de: " + totalCompra);
		leitor.close();
	}
}