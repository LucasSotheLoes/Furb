package semestre1.introducao_à_programação.unidade5;


public class Exercicio11 {
	public static void main(String[]args) {		
		int biscoitoQuebrados = 1,totalBiscoitoQuebrados = 0, horasOperando = 16;
		for(int i = 1; i < horasOperando;i++) {
				totalBiscoitoQuebrados += biscoitoQuebrados;
				totalBiscoitoQuebrados *= 3;
		}
		System.out.println("O total de biscoito quebrados foi de: " + totalBiscoitoQuebrados);
	}
}
