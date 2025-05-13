package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio13 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("informe o comprimento e a altura da parede: ");
			double[] medidas = new double[2];
			for(int i=0;i <=1;i++) {
				System.out.print("");
				medidas[i] =leitor.nextDouble();
			}
			double metroQuadrado = medidas[0] * medidas[1];
			double totalAzulejo = metroQuadrado * 9;
			double preco = totalAzulejo * 12.5;
			System.out.println("o preço total é de: " + preco );
			leitor.close();
		}
}