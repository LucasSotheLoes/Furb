package semestre2.poo.unidade10.exercicio1;

public class Circulo extends Figura{
	private int raio;

	Circulo(int raio){
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double pi = 3.14;
		double area = pi * (raio * raio);
		return area;
	}
	
}
