package semestre2.poo.unidade09.exercicio1;

public class ContaBancaria {
	
	private String numero;
	private double saldo;
	private Cliente titular;

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public void depositar(double valor) {
			double valorTotal = valor + getSaldo();
			setSaldo(valorTotal);
	}	
	public void sacar(double valor) {
		double valorTotal = 0;
		if(getSaldo() >= valor) {
			valorTotal = getSaldo() - valor;
			setSaldo(valorTotal);
		}
		else
			 throw new IllegalArgumentException("Não é possivel sacar um valor maior que o saldo o saldo é de: " + getSaldo());
		
	}
	public void transferir(ContaBancaria contaDestino,double valor) {
		if(getSaldo() >= valor) {
		contaDestino.setSaldo(valor + contaDestino.getSaldo());
		setSaldo(getSaldo() - valor);
		} else
			throw new IllegalArgumentException("Não é possivel transferir um valor maior que o saldo.\n O saldo é de: " + getSaldo());
	}
}
