package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio02 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o preço do par de sapatos: ");
			double preco = leitor.nextDouble();
			
			double desconto = preco * 0.12;
			double precoTotal = preco - desconto;
			System.out.println("O desconto é de: "+ desconto + " e o preço total é de: "+ precoTotal);
			leitor.close();
		}
}
