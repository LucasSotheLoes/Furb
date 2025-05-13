package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio01 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			double[] ladoDoTerreno = new double[2];
			
			for(int i = 0;i <= 1; i++) {
			System.out.println("Insira o valores dos lados do terreno");
			ladoDoTerreno[i] = leitor.nextDouble();
			}
			double areaDoTerreno = ladoDoTerreno[0] * ladoDoTerreno[1]; 
			System.out.println(areaDoTerreno);
			leitor.close();
		}
}
