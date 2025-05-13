package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[]args) {
	Scanner pingo = new Scanner(System.in);
	System.out.println("Escreva o peso da carta");
	double peso = pingo.nextDouble();
	double valorPagar = 0;
	if (peso <= 50) {
	valorPagar = 0.45;
	} else {
	double pesoExecedido = peso - 50;
	double quantidadeAdicional = (pesoExecedido /20) + 1;
	valorPagar = 0.45 + 0.45 * quantidadeAdicional;
	}
	System.out.println("Custo do selo: " + valorPagar);
	pingo.close();
    }
}