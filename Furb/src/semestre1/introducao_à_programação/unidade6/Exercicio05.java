package semestre1.introducao_à_programação.unidade6;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		char []rapaz = new char[5];
		char []moca = new char[5];
		String[] perguntas = {"você gosta de futebol?", "Você gosta de musica sertaneja?", "Você gosta de seriados?", 
				"Você gosta de redes sociais?", "Você gosta da Oktoberfest?"};
		char genero;
		int afinidade = 0, contador = 0;
		while(contador < 2) { 
		System.out.println("Voce é o Rapaz(H) ou a Moça(M): ");
		genero = leitor.next().toUpperCase().charAt(0);
		System.out.println("Responda as pergunta a seguir de acordo com estas repostas: se for sim (S), se for não (N) se for indiferente (I)");
		for(int i = 0;i < perguntas.length;i++) {
		if(genero == 'H') {	
			System.out.println(perguntas[i]);
			rapaz[i] = leitor.next().toUpperCase().charAt(0);
		} else {
			System.out.println(perguntas[i]);
			moca[i] = leitor.next().toUpperCase().charAt(0);
			}
		}
		contador++;
		}
		for(int i = 0;i < perguntas.length;i++) {
			if(moca[i] == rapaz[i])
				afinidade += 3;
			else if(moca[i] == 'I' && rapaz[i] == 'S' || rapaz[i] == 'N')
				afinidade++;
			else if(rapaz[i] == 'I' && moca[i] == 'S' || moca[i] == 'N')
				afinidade++;
			else if(moca[i] == 'N' && rapaz[i] == 'S')
				afinidade -= 2;
			else if(rapaz[i] == 'N' && moca[i] == 'S')
				afinidade -= 2;
		}
			if(afinidade == 15)
				System.out.println("Casem");
			else if(afinidade < 15 && afinidade > 9)
				System.out.println("Vocês tem muita coisa em comum!");
			else if(afinidade < 10 && afinidade > 4)
				System.out.println("Talvez não de certo :(");
			else if(afinidade > -1 && afinidade < 5)
				System.out.println("vale um encontro");
			else if(afinidade < 0 && afinidade > -9)
				System.out.println("Melhor não perder tempo");
			else if(afinidade < -10)
				System.out.println("Vocês se odeiam");
		leitor.close();
	}
}