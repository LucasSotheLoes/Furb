package semestre2.poo.unidade10.exercicio1;

public class Retangulo extends Figura{
	private int largura;
	private int altura;
	
	Retangulo(int largura,int altura){
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double area = largura * altura;
		return area;
	}
}
