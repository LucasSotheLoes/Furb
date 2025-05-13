package semestre2.poo.unidade06.exercicio1;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("0.00");
	private String nome;
	private double salario;
	
	Funcionario(String nome,double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	FaixaIrpf identificarFaixaIrpf() {
		if(salario <= 1903.98)
			return FaixaIrpf.PRIMEIRA;
		else if(salario >= 1903.99 && salario <= 2826.65)
			return FaixaIrpf.SEGUNDA;
		else if(salario >= 2826.65 && salario <= 3751.05)
			return FaixaIrpf.TERCEIRA;
		else if(salario >= 3751.06 && salario <= 4664.68)
			return FaixaIrpf.QUARTA;
		else 
			return FaixaIrpf.QUINTA;
	}
	public double calcularIrpf() {
		double imposto = 0;
		if (identificarFaixaIrpf() == FaixaIrpf.PRIMEIRA)
			imposto = 0;
		else if(identificarFaixaIrpf() == FaixaIrpf.SEGUNDA)
			imposto = (salario - 1903.99) * 0.075;
		else if(identificarFaixaIrpf() == FaixaIrpf.TERCEIRA)
			imposto = ((2826.65 - 1903.99) * 0.075) + ((salario - 2826.66) * 0.15);
		else if(identificarFaixaIrpf() == FaixaIrpf.QUARTA)
			imposto = ((2826.65 - 1903.99) * 0.075) + ((3751.05 - 2826.65) * 0.15) + ((salario - 3751.05) * 0.225);
		else if(identificarFaixaIrpf() == FaixaIrpf.QUINTA)
			imposto = ((2826.65 - 1903.99) * 0.075) + ((3751.05 - 2826.65) * 0.15) + ((4664.69 - 3751.06) * 0.225) + ((salario - 4664.69) * 0.275);
		return imposto;
	}
}
