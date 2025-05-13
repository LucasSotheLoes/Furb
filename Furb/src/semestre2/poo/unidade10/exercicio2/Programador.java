package semestre2.poo.unidade10.exercicio2;

import java.util.ArrayList;

public class Programador extends Funcionario {

	private ArrayList<String> linguagens = new ArrayList<>();

	Programador(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	public void incluirLinguagem(String linguagem) {
		linguagens.add(linguagem);
	}

	public void removerLinguagem(String linguagem) {
		linguagens.remove(linguagem);
	}

	public ArrayList<String> getLinguagens() {
		return linguagens;
	}

	@Override
	public double calcularSalario() {
		double salario;
		for (String l : linguagens)
			if (l.equalsIgnoreCase("java")) {
				salario = (getSalarioBase() * 1.20);
				return salario;
			}
		return getSalarioBase();
	}
}