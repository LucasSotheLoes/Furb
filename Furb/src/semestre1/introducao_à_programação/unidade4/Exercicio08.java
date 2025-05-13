package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[]args) {
	Scanner pingo = new Scanner(System.in);
	System.out.println("Escreva uma letra: ");
	String letra = pingo.next();
	if (letra.equalsIgnoreCase("a") ||
	letra.equalsIgnoreCase("e")	||
	letra.equalsIgnoreCase("i") ||
	letra.equalsIgnoreCase("o") ||
	letra.equalsIgnoreCase("u")){
	System.out.println("É vogal");
	} else {
	System.out.println("Não é vogal");
	}
	pingo.close();
    }
}