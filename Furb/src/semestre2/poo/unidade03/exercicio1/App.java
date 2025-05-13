package semestre2.poo.unidade03.exercicio1;

import java.util.Scanner;

public class App {
	public static void main(String[]args) {
	Scanner leitor = new Scanner(System.in);
		Funcionario[] funcionario = new Funcionario[5];
		funcionario[0] = new Funcionario();
		funcionario[1] = new Funcionario();
		funcionario[2] = new Funcionario();
		funcionario[3] = new Funcionario();
		funcionario[4] = new Funcionario();
		int a = 0;
		while (a < 5) {
		System.out.println("Informe o nome do funcionario " + a +": ");
		funcionario[a].setNome(leitor.next()) ;
		System.out.println("Informe salario do funcionario" + a +": ");
		funcionario[a].setSalario(leitor.nextDouble());
		a++;
		}
		for(int i = 0;i < 5;i++) {
			 System.out.printf("%s tem salario de: %.2f e paga de IRPF %.2f%n", funcionario[i].getNome(), funcionario[i].getSalario(), funcionario[i].calcularIrpf());
		}
		leitor.close();
		
	}
}
