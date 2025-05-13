package semestre2.poo.prova02;

public class Locacao implements Relatorio{
	private int quantidadeDias;
	private Pessoa pessoa;
	
	
	public int getQuantidadeDias() {
		return quantidadeDias;
	}
	public void setQuantidadeDias(int quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public double getValorTotal() {
		return pessoa.getVeiculo().getPrecoDiaria() * getQuantidadeDias();
	}
	@Override
	public String imprimir() {
		String oi = "Pessoa"
				+ "\nNome: " + pessoa.getNome()
				+ "\nCNPJ/CPF: " + pessoa.getCpfCnpj()
				+ "\nTelefone: " + pessoa.getTelefone()
				+ "\nEmail: " + pessoa.getEmail();
		return oi;
	}
	
}
