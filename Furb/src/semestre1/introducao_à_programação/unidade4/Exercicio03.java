package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int[] numeros = new int[2];
		System.out.println("Informe dois numeros inteiros");
		for (int i = 0;i <=1;i++) {
			numeros[i] = leitor.nextInt();
		}
		if (numeros[0] > numeros[1]){
			System.out.println(numeros[0]);
		} else {
			System.out.println(numeros[1]);
		 }
		leitor.close();
	}
}