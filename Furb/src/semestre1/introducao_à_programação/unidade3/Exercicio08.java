package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio08 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			double[] quantidade = new double[2];
			System.out.println("digite quanto foi dado para a troca e quanto está a cotação");
			for(int i = 0;i <= 1; i++) {
			System.out.print("");
			quantidade[i] = leitor.nextDouble();
			}
			
			double totalDevolvido = (quantidade[0] / quantidade[1]); 
			System.out.println(totalDevolvido+ " é o valor que o funcionario terá de devolver");
			leitor.close();
		}
	}