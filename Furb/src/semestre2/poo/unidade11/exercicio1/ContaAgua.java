package semestre2.poo.unidade11.exercicio1;

public class ContaAgua implements Pagavel{
	private int metrosCubicos;
	private double precoMetroCubico;
	
	ContaAgua(int metrosCubicos,double precoMetroCubico){
		this.metrosCubicos = metrosCubicos;
		this.precoMetroCubico = precoMetroCubico;
	}

	@Override
	public double calcularValorPagar() {
		double valorPagar = metrosCubicos * precoMetroCubico;
		return valorPagar;
	}
}
