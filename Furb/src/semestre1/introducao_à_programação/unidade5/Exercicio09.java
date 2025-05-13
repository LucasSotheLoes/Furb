package semestre1.introducao_à_programação.unidade5;
 
import java.util.Scanner;
 
public class Exercicio09 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int a20 = 0;
		System.out.println("Informe a quantidade de alunos na turma: ");
		int n = scanner.nextInt();
		int[]idades= new int[n];
		String[]nomes = new String[n];
		String[]nomes18 = new String[n];
		
		System.out.println("informe o nome e a idade de cada aluno, respectivamente: ");
		for(int i = 0;i < idades.length;i++) {
			nomes[i] = scanner.next();
			idades[i] = scanner.nextInt();
			if(idades[i] == 18)
				nomes18[i] = nomes[i];
			if(idades[i] >= 20)
				a20++;
		}
		for(String nome : nomes18)
			if(nome != null)
			System.out.println("O nome dos com 18 anos são: " + nome);
		System.out.println("A quantidade de alunos com 20 anos ou mais é de: " + a20);
			
				
		scanner.close();
	}
}