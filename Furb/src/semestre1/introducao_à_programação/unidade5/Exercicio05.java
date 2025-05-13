package semestre1.introducao_à_programação.unidade5;
 
import java.util.Scanner;
 
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos que deseja na sequência: ");
        int n = scanner.nextInt();
        int[]valores = new int[n+2];
        for (int i = 0; i < n; i++) {
        	for(int g = 8; g < 8 + n;g++) {
        		valores[i] = g;
        		
        	}
        }
        scanner.close();
    }	
}