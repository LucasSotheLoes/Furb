package semestre2.poo.prova02;

import java.util.ArrayList;

public class LocacaoPessoaJuridica extends Locacao {

	private ArrayList<Veiculo> veiculos = new ArrayList<>();

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void incluirVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	public void removerVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}
	@Override
	public double getValorTotal() {
		double valorLocacoes = 0;
		for (Veiculo v : veiculos) {
			valorLocacoes += (v.getPrecoDiaria() * getQuantidadeDias());
		}
		return valorLocacoes;

	}
	@Override
	public String imprimir() {
		String oi = "Pessoa"
				+ "\nNome: " + getPessoa().getNome()
				+ "\nCNPJ: " + getPessoa().getCpfCnpj()
				+ "\nTelefone: " + getPessoa().getTelefone()
				+ "\nEmail: " + getPessoa().getEmail();
		return oi;
	}
}
