package semestre2.poo.unidade09.exercicio1;

public class ContaEspecial extends ContaBancaria {

	private double limiteCredito;

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public void sacar(double valor) {

		if (getSaldo() + getLimiteCredito() >= valor) 
			setSaldo(getSaldo() - valor);
		 else
			throw new RuntimeException("Você não tem limite para esse saque o saldo atual é de " + getSaldo() +
					" e o seu limite de credito é de: " + getLimiteCredito());
	}
}
