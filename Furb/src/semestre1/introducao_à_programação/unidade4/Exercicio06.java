package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args) {
	Scanner pingo = new Scanner(System.in);
	System.out.println("digite m para masculino, f para feminino, i para não informar");
	String letra = pingo.next();
	if (letra.equalsIgnoreCase("m")) {
	System.out.println("Masculino");
	} else if (letra.equalsIgnoreCase("f")){
	System.out.println("Feminino");
	} else if(letra.equalsIgnoreCase("i")){
	System.out.println("Não informado");
	} else {
	System.out.println("Entrada incorreta");
	}
	pingo.close();
    }
}