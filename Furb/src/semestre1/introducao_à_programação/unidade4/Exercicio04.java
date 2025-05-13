package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[]args) {
		Scanner pingo = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		double numero = pingo.nextDouble();
		if (numero % 1 != 0) {
            System.out.println("O número tem casas decimais.");
        } else {
            System.out.println("O número não tem casas decimais.");
        }
		pingo.close();
	}
}