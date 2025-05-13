package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio14 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("informe a distancia percorrida e o tempo gasto: ");
			double[] informacoes = new double[2];
			for(int i=0;i <=1;i++) {
				System.out.print("");
				informacoes[i] =leitor.nextDouble();
			}
			double velocidadeMedia = informacoes[0] / informacoes[1];
			 System.out.println("A velocidade média foi de: " + velocidadeMedia + " km/h");
			double consumoPorLitro = 12;
			double combustivelGasto = informacoes[0] / consumoPorLitro;
			System.out.println("A quantidade de combustível gasto foi de: " + combustivelGasto + " litros");
			leitor.close();
		}
	}