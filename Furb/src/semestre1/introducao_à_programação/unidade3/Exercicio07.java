package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio07 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			double[] quantidade = new double[3];
			System.out.println("As opções para compra são lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros");
			for(int i = 0;i <= 2; i++) {
			System.out.println("Digite quantos vai querer de cada");
			quantidade[i] = leitor.nextDouble();
			}
			
			double totalDeLitros = (quantidade[0] * 0.35 + quantidade[1] * 0.6 + quantidade[2] * 2); ; 
			System.out.println(totalDeLitros+ " é o total de litros comprado");
			leitor.close();
		}
	}