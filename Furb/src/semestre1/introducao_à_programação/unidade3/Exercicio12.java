package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio12 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("informe o nome do funcionario: ");
			String nome = leitor.next();
			double[] dados = new double[2];
			System.out.println("Informe o numero de horas trabalhadas e o número de dependentes");
			for(int i=0;i <=1;i++) {
				System.out.print("");
				dados[i] =leitor.nextDouble();
			}
			double salarioHora = dados[0] * 10;
			double salarioDependente = dados[1] * 60;
			double descontoINSS = salarioHora * 0.085;
			double descontoIR = salarioHora * 0.05;
			double salarioBruto = salarioHora + salarioDependente;
			double salarioTotal = (salarioHora + salarioDependente) - descontoINSS - descontoIR ;
			System.out.println("o nome do funcionario é: " + nome + "o salario bruto é de: " + salarioBruto + " e o salario liquido é de: " + salarioTotal);
			leitor.close();
		}
}