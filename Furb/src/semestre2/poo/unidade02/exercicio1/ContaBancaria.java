package semestre2.poo.unidade02.exercicio1;

import java.util.Scanner;

public class ContaBancaria {
	Scanner scanner = new Scanner(System.in);
	
	private String numero;
	private String titular;
	private double saldo;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
		saldo += valor;
		System.out.println("Deposito efetuado");
		} else 
			System.out.println("Valor inválido");
	}
	
		void sacar(double valor) {
			if(valor > 0 ) 
				if((saldo - valor) < 0) 
				System.out.println("Saque invalido");
			 else {
				System.out.println("Saque concluido");
				saldo -= valor;
			}
				
		 else 
			System.out.println("Valor invalido");
		}
		
		void transferir(ContaBancaria contaDestino, double valor) {
				saldo -= valor;
				contaDestino.setSaldo(contaDestino.getSaldo() + valor); 
				System.out.println("Saldo transferido com sucesso");
		}
	
}
