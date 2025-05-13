package semestre2.poo.unidade01.exercicio1;

public class Pessoa {
	public double peso;
	public double altura;
	public String nome;
	
			
	public double calcularImc() {
		double imc = peso / (altura*altura);
		return imc;
	}	
}
