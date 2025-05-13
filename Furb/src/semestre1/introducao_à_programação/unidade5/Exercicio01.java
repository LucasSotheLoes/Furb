package semestre1.introducao_à_programação.unidade5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[20];
		System.out.println("Informe 20 valores inteiros: ");
		for(int i = 0;i < numeros.length;i++) 
			numeros[i] = scanner.nextInt();
		Arrays.sort(numeros);
		for(int numero : numeros)
			if(numero % 2 == 0)
				System.out.println("O numero é par: " + numero);
			else if (numero % 2 != 0)
				System.out.println("O numero é impar: " + numero);
		
		scanner.close();
	}
}
