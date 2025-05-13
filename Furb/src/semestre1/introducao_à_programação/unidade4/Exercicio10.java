package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args){
	Scanner pingo = new Scanner(System.in);
	int[] idades= new int[3];
	String[] nomes = new String[3];
	System.out.println("Escreva o nome seguido da idade de cada um dos filhos");
	for (int i = 0;i < 3;i++){
	nomes[i] = pingo.next();
	idades[i] = pingo.nextInt();
	}
	if (idades[0] < idades[1] &&idades[0] < idades[2]){
	System.out.println("O filho caçula é: " + nomes[0] + " e sua idade é: " + idades[0]);
	} else if (idades[1] < idades[2] &&idades[1] < idades[0]){
	System.out.println("O filho caçula é: " + nomes[1] + " e sua idade é: " + idades[1]);
	} else {
	System.out.println("O filho caçula é: " + nomes[2] + " e sua idade é: " + idades[2]);
	}
	pingo.close();
    }	
}