package semestre1.introducao_à_programação.unidade6;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int notaTotal = 0, notaTotalHomens = 0, homens = 0,menorIdadeMulher = Integer.MAX_VALUE, notaMulherJovem= 0, contadorMulheres50 = 0, mulher = 0;
		double notaMedia, mediaHomens = 0;
		int []nota = new int[30];
		int []genero = new int[30];
		int []idade = new int[30];
		int []notaMulher50 = new int[30];
		String []perguntas = {"Qual seu genero? \nMasculino digite (1): \nFeminino digite (2): ", "De uma nota ao cinema de 0 a 10: ", "Qual sua idade: "};
		for(int i = 0;i < genero.length;i++) {
			System.out.println(perguntas[0]);
				genero[i] = leitor.nextInt();
			System.out.println(perguntas[1]);
				nota[i] = leitor.nextInt();
			System.out.println(perguntas[2]);
				idade[i] = leitor.nextInt();
				notaTotal += nota[i];
				if(genero[i] == 1) {
					notaTotalHomens += nota[i];
					homens++;
				}
				if(genero[i] == 2) {
					if(idade[i] < menorIdadeMulher) {
						menorIdadeMulher = idade[i];
						notaMulherJovem = nota[i];
						mulher++;
					}		
				}
				if(genero[i] == 2 && idade[i] > 49) {
					notaMulher50[i] = nota[i];
				}
			}
		notaMedia = notaTotal / 30;
		for(int i = 0; i < notaMulher50.length;i++) {
			if(notaMulher50[i] > notaMedia)
				contadorMulheres50++;
		}
		System.out.println("A nota média é de: " + notaMedia);
		if(homens != 0) {
			mediaHomens = notaTotalHomens / homens;
		System.out.println("A nota média dos homens é de: " + mediaHomens);
		} else
			System.out.println("Nenhum homen respondeu a pesquisa");
		if(mulher != 0) 
		System.out.println("A nota da mulher mais jovem é de: " + notaMulherJovem);
		else
			System.out.println("Nenhuma mulher respondeu a pesquisa");
		if(contadorMulheres50 != 0)
		System.out.println("A quantidade de notas acima da média de mulher com mais de 50 anos foi de: " + contadorMulheres50);
		else
			System.out.println("Nenhuma mulher com mais de 50 anos respondeu a pesquisa");
		leitor.close();
	}
}