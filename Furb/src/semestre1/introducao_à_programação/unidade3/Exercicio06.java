package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio06 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Quanto pesa o prato do cliente em quilos: ");
			double peso = leitor.nextDouble();
			
			double preco = peso * 25;
			
			System.out.println("O preço para um prato com "+ peso + " quilos é de: "+ preco);
			
			leitor.close();
		}
}
