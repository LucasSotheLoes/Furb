package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args){
	Scanner pingo = new Scanner(System.in);
		int[] valores = new int[2];
		System.out.println("Escreva dois valores inteiros");
			for (int i = 0;i < 2;i++){
			valores[i] = pingo.nextInt();
				}if (valores[0] > valores[1]) {
					if (valores[0] % valores[1] == 0){
						System.out.println("Os valores são multiplos");
					} else {
						System.out.println("Os valores não são multiplos");
					}
					} else {
					if (valores[1] % valores[0] == 0){
							System.out.println("Os valores são multiplos");
						} else {
							System.out.println("Os valores não são multiplos");
						}	
					}
				pingo.close();
    }	
}