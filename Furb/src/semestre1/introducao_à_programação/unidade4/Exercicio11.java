package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	int[] dataDeNascimento = new int[3];
	String[] nomes = new String[3];
	System.out.println("Escreva o nome seguido do ano da data de nascimento de cada um dos filhos");
	for (int i = 0;i < 3;i++){
	nomes[i] = scanner.next();
	dataDeNascimento[i] = scanner.nextInt();
	}
	if(dataDeNascimento[0] == dataDeNascimento[1] &&dataDeNascimento[0] == dataDeNascimento[2]){
	System.out.println("Os filhos: " + nomes[0] + " " + nomes[1] + " " + nomes[2] + " São trigêmeos");
	} else if (dataDeNascimento[0] == dataDeNascimento[1] ||dataDeNascimento[0] == dataDeNascimento[2]) {
	System.out.println("Há dois filhos gêmeos");
	} else if (dataDeNascimento[1] == dataDeNascimento[0] ||dataDeNascimento[1] == dataDeNascimento[2]){
	System.out.println("Há dois filhos gêmeos");
	} else {
	System.out.println(nomes[0] + " " + nomes[1] + " " + nomes [2] + " São apenas irmãos");
	} scanner.close();

    }	
}
