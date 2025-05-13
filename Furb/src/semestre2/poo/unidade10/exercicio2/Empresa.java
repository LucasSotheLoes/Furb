package semestre2.poo.unidade10.exercicio2;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();

	Empresa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void incluirFuncionario(Funcionario f) {
		funcionarios.add(f);
	}

	public void removerFuncionario(Funcionario f) {
		funcionarios.remove(f);
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public double calcularCustoSalario() {
		return funcionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();
	}
}
