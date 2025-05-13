package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		String continuar = "s",nome;
		int quantidadeProdutos = 0;
		double quantidadeVendas = 0, salario, salarioTotal = 0;
		
		while(continuar.equalsIgnoreCase("s")) {
			System.out.println("Escreva o nome do vendendor");
			nome = leitor.next();
			System.out.println("Digite o numero de vendas: ");
			quantidadeProdutos = leitor.nextInt();
			System.out.println("Digite o total de valor: ");
			quantidadeVendas = leitor.nextDouble();
			System.out.println("Informe o salario do vendedor: ");
			salario = leitor.nextDouble();
			salarioTotal = salario + (quantidadeVendas * 0.3);
			System.out.println("o vendendor: " + nome + " o total em vendas dele foi de: "+ quantidadeVendas + " e seu salario foi de: " + salarioTotal);
			System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
			continuar = leitor.next();
		}
		
		leitor.close();
	}
}
