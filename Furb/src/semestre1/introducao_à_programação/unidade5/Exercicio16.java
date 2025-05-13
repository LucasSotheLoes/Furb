package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio16 {
	public static void main (String[]args) {		
		Scanner leitor = new Scanner(System.in); 
			
			char genero;
			double altura = 1, somaAlturaMulheres = 0,somaAlturaGrupo = 0, mediaMulheres = 0, mediatotal = 0;
			int quantidadeMulheres = 0, quantidadeGrupo = 0;
					
				while (altura != 0) {
					System.out.println("Digite o seu genero: ");
					genero = leitor.next().toUpperCase().charAt(0);
					
					System.out.println("Digite a altura: ");
					altura = leitor.nextDouble();
					
					quantidadeGrupo++;
					somaAlturaGrupo += altura;
					
					if(genero == 'F') {
						quantidadeMulheres++;
						somaAlturaMulheres += altura;	
					} 
				}
				mediaMulheres = somaAlturaMulheres / quantidadeMulheres;
				
				mediatotal = somaAlturaGrupo / quantidadeGrupo;
				
				System.out.println("Média da altura das mulheres: "+ mediaMulheres);
				System.out.println("Média da altura do grupo: "+ mediatotal);
		
	leitor.close();
	}
}