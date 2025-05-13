package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

	public class Exercicio10 {
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("informe os catetos");
			double[] catetos = new double[2];
			for(int i=0;i <=1;i++) {
				System.out.print("");
				catetos[i] =leitor.nextDouble();
			}
			double hipotenusa = Math.sqrt(catetos[1] * catetos[1] + catetos[0] * catetos[0]);
			System.out.println("o valor da hipotenusa é de: " + hipotenusa );
			leitor.close();
		}
}
