package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[]args) {
	Scanner pingo = new Scanner(System.in);
	System.out.println("A cor é azul");
	boolean resposta = pingo.nextBoolean();
	if (resposta = true) {
	System.out.println("Sim");
	} else {
	System.out.println("Não");
	}
	pingo.close();
	}
}