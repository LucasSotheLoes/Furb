package semestre1.introducao_à_programação.unidade5;

public class Exercicio03 {
	public static void main(String[]args) {
		double resultado = 0.0;
		
		for(int i = 1;i <= 100;i++) 
			resultado += 1.0 / i;
		
		System.out.println("O resultado é: " + resultado);
	}
}