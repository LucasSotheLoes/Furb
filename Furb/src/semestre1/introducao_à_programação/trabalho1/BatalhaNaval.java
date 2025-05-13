package semestre1.introducao_à_programação.trabalho1;

import java.util.Random;
import java.util.Scanner;
 
public class BatalhaNaval {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		Random gerador = new Random();
		//Criei as colunas e linhas como 9 para o jogador possa usar de 1 a 8 inves de 0 a 7 nas casas do mapa
		int ataquesTotais = 0, ataqueBemSucedido = 0, colunaAtacada = 0, linhaAtacada = 0, barcos = 0, colunas = 9, linhas = 9;
		//Criado as matrizez que representão os tabuleiros do jogo e as preenchendo com o mar
		char tabuleiroCasasAtacadas[][] = new char[linhas][colunas];
		char [][]tabuleiroBarcos = new char[linhas][colunas];
		for(int i = 1; i < linhas; i++) 
			for(int j = 1; j < colunas; j++) {
				tabuleiroBarcos[i][j] = '~';
				tabuleiroCasasAtacadas[i][j] = '~';
			}
		//Colocando os barcos no tabuleiro dos barcos
		while(barcos < 10) {
			int linha = gerador.nextInt(8);
			int coluna = gerador.nextInt(8);
				if(tabuleiroBarcos[linha][coluna] == '~') {
				tabuleiroBarcos[linha][coluna] = 'N'; 
				barcos++;
				}
			} 
		 //Criação de um menu explicando o jogo 
		 System.out.println("Bem vindo a batalha naval\nNeste jogo iremos jogar num tabuleiro de 8x8\nNeste tabuleiro existem 10 navis escondidos será que você consegue derrotá-los?\nVocê tem 30 tentativas\nSe você acertar aparacessera no mapa como (x) e se errar aparecerá como (O)");
		 for (int i = 1; i < linhas; i++) {
	            for (int j = 1; j < colunas; j++) 
	                System.out.print("~" + " ");
	            System.out.println();
	        }
		 System.out.println("Confira o mapa e informe a linha e a coluna para realizar o ataque: ");
		 //Criação dum loop que so para quando Os ataques bem sucedidos chegarem em 10 ou os totais em 30
		 while(ataquesTotais < 30 && ataqueBemSucedido < 10){
			 //Lesse a coluna e a casa atacada
			 linhaAtacada = leitor.nextInt();
			 colunaAtacada = leitor.nextInt();
			 //Faz a verificação para saber se as coordenadas são válidas
			 if(colunaAtacada <= 8 && linhaAtacada <= 8 && colunaAtacada >= 0 && linhaAtacada >= 0) {
			//Verifica se há barco ou não na posição, se houver ocorrência de barco substitui a casa por 'X' caso contrário substitui por 'O'
			 if(tabuleiroBarcos[linhaAtacada][colunaAtacada] == 'N' && tabuleiroCasasAtacadas[linhaAtacada][colunaAtacada] != 'X') {
				 ataqueBemSucedido++;
				 tabuleiroCasasAtacadas[linhaAtacada][colunaAtacada] = 'X';
				 System.out.println("Você acertou um barco!!!\nConfira como esta o mapa");
			 } else if(tabuleiroCasasAtacadas[linhaAtacada][colunaAtacada] == 'X' || tabuleiroCasasAtacadas[linhaAtacada][colunaAtacada] == 'O')
				 System.out.println("Essa coordenada já foi atacada!!!\nVocê perdeu um ataque tente novamente em outra coordenada");
			 else {
				 tabuleiroCasasAtacadas[linhaAtacada][colunaAtacada] = 'O';
				 System.out.println("Você errou os barcos\nConfira como esta o mapa");
			 }
			 //Imprime o tabuleiro com as casas atualizadas
			 for (int i = 1; i < linhas; i++) {
		            for (int j = 1; j < colunas; j++) 
		                System.out.print(tabuleiroCasasAtacadas[i][j] + " ");
		            System.out.println();
		        }
			 //Soma a cada ataque com casa válida
			 ataquesTotais++;
			 //Verifica se o jogador ainda têm direito a ataques
			 if(ataquesTotais < 30 && ataqueBemSucedido < 10)
			 System.out.println("Informe uma nova coluna e uma nova linha para realizar o ataque: ");
			 } else 
				 System.out.println("Posição Inválida!!!\nInsira outra coluna e linha Lembrando que eles tem que ser de 0 a 8");
		 } 
		 //Verificação de vitoria ou derrota do jogador
		 if(ataqueBemSucedido == 10)
			 System.out.println("Você venceu\nParabéns você conseguio atingir todos os barcos escondidos!!!");
		 else
			 System.out.println("Que pena suas tentativas acabaram!!! \nVocê perdeu\nMais sorte na proxima vez");
		 //Mostrando onde os barcos estavam após o fim do jogo
		 System.out.println("Confira onde os barcos estavam");
		 for (int i = 1; i < linhas; i++) {
	            for (int j = 1; j < colunas; j++) 
	                System.out.print(tabuleiroBarcos[i][j] + " ");
	            System.out.println();
	        }
		 System.out.println("Confira como ficou o seu tabuleiro das casas atacadas");
		 for (int i = 1; i < linhas; i++) {
	            for (int j = 1; j < colunas; j++) 
	                System.out.print(tabuleiroCasasAtacadas[i][j] + " ");
	            System.out.println();
	        }
		leitor.close();
	}
}