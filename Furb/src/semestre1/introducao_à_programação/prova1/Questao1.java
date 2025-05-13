package semestre1.introducao_à_programação.prova1;
import java.util.Scanner;

public class Questao1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String letra;
		System.out.println("Insira uma letra");
		letra = scanner.next();
		
		letra = letra.toUpperCase();
		if(letra == "A") 
			System.out.println("Azul");
		else if (letra == "M")
			System.out.println("Marrom");
		else if (letra == "V")
			System.out.println("Vermelho");
		else
			System.out.println("Entrada incorreta");
		scanner.close();
	}
}
