package semestre2.poo.unidade11.exercicio1;

public class PrevidenciaPrivada extends Investimento{
	
	private double valor;
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public void investir() {
		setSaldo(getSaldo() + valor);
	}
	@Override
	public double calcularValorPagar() {
		double valorTotal = 0;
		valorTotal += valor;
		return valorTotal;
	}
}
