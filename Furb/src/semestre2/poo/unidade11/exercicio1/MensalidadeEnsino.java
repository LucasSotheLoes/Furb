package semestre2.poo.unidade11.exercicio1;

public class MensalidadeEnsino implements Pagavel{
	private int nrCreditos;
	private double precoCredito;
	
	MensalidadeEnsino(int nrCreditos,double precoCredito){
		this.nrCreditos = nrCreditos;
		this.precoCredito = precoCredito;
	}
	
	@Override
	public double calcularValorPagar() {
		double valorPagar = precoCredito * nrCreditos;
		return valorPagar;
	}
	
}
