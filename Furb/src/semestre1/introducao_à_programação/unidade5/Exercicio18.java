package semestre1.introducao_à_programação.unidade5;
 
import java.util.Scanner;
 
public class Exercicio18 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		double canal = 1, pessoasAssistindo = 0, totalPessoasAssistindo = 0, canal4 = 0,
		canal5 = 0, canal9 = 0, canal12 = 0, percentual4, percentual5, percentual9,percentual12;
		
		while(canal != 0){
			System.out.println("Qual número de canal vocês estão assistindo (4), (5), (9) ou (12) digite (0) para ambas opções se a tv estiver desligada: ");
			canal = leitor.nextDouble();
			
			System.out.println("Quantas pessoas estão assistindo o canal");
			pessoasAssistindo = leitor.nextDouble();
			
			if(canal == 4)
				canal4 += pessoasAssistindo;
			else if(canal == 5)
				canal5 += pessoasAssistindo;
			else if(canal == 9)
				canal9 += pessoasAssistindo;
			else if(canal == 12)
				canal12 += pessoasAssistindo;
			
			totalPessoasAssistindo += pessoasAssistindo;
		}
		percentual4 = (canal4 / totalPessoasAssistindo) * 100;
		percentual5 = (canal5 / totalPessoasAssistindo) * 100;
		percentual9 = (canal9 / totalPessoasAssistindo) * 100;
		percentual12 = (canal12 / totalPessoasAssistindo) * 100;
		System.out.printf("O percentual do canal 4 é de: %.2f%%%n \nO percentual do canal 5 é de: %.2f%%%n  \nO percentual do canal 9 é de: %.2f%%%n  \nO percentual do canal 12 é de: %.2f%%%n", percentual4, percentual5, percentual9, percentual12);
        
		leitor.close();
	}
}