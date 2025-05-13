package semestre2.poo.unidade04.exercicio1;

import javax.swing.JLabel;

public class Retangulo {
	private int altura = 0;
	private int comprimento = 0;
	private int perimetro;
	private int area;
	
	Retangulo(){
	altura = 0;
	comprimento = 0;
	}
	Retangulo(int a, int b){
		altura = a;
		comprimento = b;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int calcularPerimetro(){
		perimetro += (altura * 2) + (comprimento * 2);
		return perimetro;
	}
	public int calcularArea() {
		area += altura * comprimento;
		return area;
	}
}
