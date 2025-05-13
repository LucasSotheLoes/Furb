package semestre1.introducao_à_programação.unidade5;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Exercicio08 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe um numero inteiro: ");
		int n = scanner.nextInt();
		double[]numeros = new double[n];
		double media = 0;
		System.out.println("informe " + n + " numeros reias");
		for(int i = 0; i < numeros.length;i++) {
			numeros[i] = scanner.nextDouble();
			if(numeros[i] >= 0)
			media += numeros[i];	
		}
		Arrays.sort(numeros);
			System.out.println("O menor numero é: " + numeros[0] + " e a média dos numeros é de " + media / n);
		scanner.close();
	}
}