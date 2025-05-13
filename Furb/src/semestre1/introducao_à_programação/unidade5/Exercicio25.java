package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int d = 0, e = 0;
		char ponto;
		
		while(true) {
			System.out.println("Qual jogador marcou ponto \nDigite(e) para o do lado esquerdo: \nDigite(d) para o lado direito:");
			ponto = leitor.next().toUpperCase().charAt(0);;
			if(ponto == 'D')
				d++;
			else if(ponto == 'E')
				e++;
			if ((d >= 21 && Math.abs(d - e) >= 2) ||
	                (e >= 21 && Math.abs(d - e) >= 2)) {
	                break;
	            }
		}
		if (d > e) {
            System.out.println("O vencedor é o jogador do lado direito com " + d + " pontos contra " + e + " do lado esquerdo");
        } else {
            System.out.println("O vencedor é o jogador do lado esquerdo com " + e + " pontos contra " + d + " do lado direito");
        }
		leitor.close();
	}
}
