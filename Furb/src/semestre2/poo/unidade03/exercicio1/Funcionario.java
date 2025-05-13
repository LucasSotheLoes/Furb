package semestre2.poo.unidade03.exercicio1;

import java.util.Scanner;

public class Funcionario {

	Scanner leitor = new Scanner(System.in);
	private String nome;
	private double salario;
	
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
		if(salario < 0) {
			throw new IllegalArgumentException("salario não pode ser negativo");
		}
		this.salario = salario;
		
	}
	
	double calcularIrpf() {
		double imposto = 0;
				if(salario < 1903.98)
					imposto = 0;
				else if(salario <= 2826.65 && salario > 1903.98) {
					imposto = (salario - 1903.98) * 0.075;
				} else if(salario > 2826.65 && salario < 3751.05) {
					imposto = (salario - 2826.65) * 0.15;
				} else if(salario > 3751.05 && salario < 4664.68) {
					imposto = (salario - 3751.05) * 0.225;
				} else if(salario > 4664.68 ) {
					imposto = (salario - 4664.68) * 0.275;
				}
			return imposto;
		}
	}
