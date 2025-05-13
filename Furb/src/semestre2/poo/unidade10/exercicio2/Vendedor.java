package semestre2.poo.unidade10.exercicio2;

import java.util.ArrayList;

public class Vendedor extends Funcionario {

	private ArrayList<Venda> vendas = new ArrayList<>();
	private double percentualComissao;

	Vendedor(String nome, double salarioBase, double percentualComissao) {
		super(nome, salarioBase);
		this.percentualComissao = percentualComissao;
	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public void incluirVenda(Venda v) {
		vendas.add(v);
	}

	@Override
	public double calcularSalario() {
		double totalVendas = 0;
		for(Venda v : vendas) {
			totalVendas += v.getValor();
		}
		setSalarioBase((getPercentualComissao() * totalVendas) + getSalarioBase());
		return getSalarioBase();
	}

}
