package semestre1.introducao_à_programação.unidade5;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Exercicio07 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um numero inteiro:");
		int n = scanner.nextInt();
		int[]valores = new int [n];
		System.out.println("informe mais " + n + " numeros");
		for(int i = 0; i < valores.length;i++)
			valores[i] = scanner.nextInt();
		Arrays.sort(valores);
		System.out.println("O maior valor é: " + valores[(n-1)] + " e o menor valor é de: " + valores[0]);
		scanner.close();
	}
}