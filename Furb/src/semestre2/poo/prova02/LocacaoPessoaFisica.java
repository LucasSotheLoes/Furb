package semestre2.poo.prova02;

public class LocacaoPessoaFisica extends Locacao {
	private Veiculo veiculo;

	
	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	@Override
	public double getValorTotal() {
		if(getQuantidadeDias() >= 5) {
			return (veiculo.getPrecoDiaria() * getQuantidadeDias()) * 0.95;
		} else
			return veiculo.getPrecoDiaria() * getQuantidadeDias();
	}
	@Override
	public String imprimir() {
		String oi = "Pessoa"
				+ "\nNome: " + getPessoa().getNome()
				+ "\nCPF: " + getPessoa().getCpfCnpj()
				+ "\nTelefone: " + getPessoa().getTelefone()
				+ "\nEmail: " + getPessoa().getEmail();
		return oi;
	}

}
