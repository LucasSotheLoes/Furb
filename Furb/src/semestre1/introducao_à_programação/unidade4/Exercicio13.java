package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int []carta = new int[3];
		System.out.println("Escreva sua mão de cartas: ");
		for(int i = 0; i < carta.length;i++) {
			carta[i] = scanner.nextInt();
		}
		int qtCartasBoas = 0;
		if(carta[0] == 1 || carta[0] == 2 || carta[0] == 3) {
			qtCartasBoas += 1;
		} if(carta[1] == 1 || carta[1] == 2 || carta[1] == 3) {
			qtCartasBoas = qtCartasBoas + 1;
		} if(carta[2] == 1 || carta[2] == 2 || carta[2] == 3) {
			qtCartasBoas++;
		} else {
			System.out.println("Sua mão não é boa");
		} if (qtCartasBoas == 1) {
			System.out.println("Truco");
		} else if (qtCartasBoas == 2){
			System.out.println("Seis");
		} else if (qtCartasBoas == 3) {
			System.out.println("Nove");
		}
		scanner.close();
	}
}
