package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio11 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("informe a temperatura em graus celsius: ");
			double celsius = leitor.nextDouble();
			
			double fahrenheits = (9.0/5.0) * celsius + 32;
			
			System.out.println("o total de graus em fahrenheits: " + fahrenheits);
			
			leitor.close();
		}
}
