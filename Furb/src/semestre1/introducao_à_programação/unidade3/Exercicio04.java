package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio04 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			double[] notas = new double[3];
			
			for(int i = 0;i <= 2; i++) {
			System.out.println("Insira as notas");
			notas[i] = leitor.nextDouble();
			}
			
			double notaFinal = (notas[0] * 5 + notas[1] * 3 + notas[2] * 2)/10; ; 
			System.out.println(notaFinal);
			leitor.close();
		}
	}