package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio09 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("informe a altura e o raio da lata em cm");
			double[] valores = new double[2];
			for(int i=0;i <=1;i++) {
				System.out.print("");
				valores[i] =leitor.nextDouble();
			}
			double pi = 3.14;
			double volume = pi * valores[0] * (valores[1]*valores[1]);
			System.out.println("o volume da lata é de: " + volume + " cm");
			leitor.close();
		}
}
