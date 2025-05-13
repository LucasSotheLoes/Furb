package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double[] precos = new double[2];
		
		for(int i = 0;i <= 1; i++) {
		System.out.println("Insira o valor do litro e o pagamento");
		precos[i] = leitor.nextDouble();
		}
		double litrosColocados = precos[1] / precos[0]; 
		System.out.println(litrosColocados);
		leitor.close();
	}
}