package semestre1.introducao_à_programação.unidade5;

public class Exercicio22 {
	public static void main(String[]args) {
		double salario = 2000, aumento = 0;
		int ano = 1996;
		while(ano != 2024) {
			if(ano == 1996) {
			aumento =+ (0.015 * salario);
			salario += aumento;
			}
			aumento *= 2;
			salario += aumento;
			ano ++;
		} 
		System.out.println("O salario atual é de: " + salario);
	}  
}