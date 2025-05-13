package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio05 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("quantos frango tem na granja: ");
			int frango = leitor.nextInt();
			
			double pernaDireita = frango * 4;
			double pernaEsquerda = frango * 2 * 3.5;
			double precoTotal = pernaDireita + pernaEsquerda;
			System.out.println("o total gasto para marcar todos os " + frango + " frangos é de: "+ precoTotal);
			leitor.close();
		}
}