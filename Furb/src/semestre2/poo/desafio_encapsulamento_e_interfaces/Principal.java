package semestre2.poo.desafio_encapsulamento_e_interfaces;



public class Principal {
	private double n1 = 0;
	private double n2 = 0;
	private char operacao;
	
	
	Principal(){}
	Principal(double n1,double n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public char getOperacao() {
		return operacao;
	}
	public void setOperacao(char operacao) {
		this.operacao = operacao;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double somar(double n1,double n2) {
		double resultado = n1 + n2;
		return resultado;
	}
	public double subtrair(double n1,double n2) {
		double resultado = n1 - n2;
		return resultado;
	}
	public double dividir(double n1,double n2) {
		double resultado = n1 / n2;
		return resultado;
	}
	public double multiplicar(double n1,double n2) {
		double resultado = n1 * n2;
		return resultado;
	}
	
}
