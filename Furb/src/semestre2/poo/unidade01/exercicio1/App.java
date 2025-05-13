package semestre2.poo.unidade01.exercicio1;

public class App {
	public static void main(String[]args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.peso = 78;
		pessoa1.altura = 1.75;
		
		System.out.println("O imc da pessoa é de: " + pessoa1.calcularImc());
	}
}
