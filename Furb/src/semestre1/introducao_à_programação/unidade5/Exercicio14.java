package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double PV = 0, PC = 0, lucro = 0, PCtotal= 0,PVtotal = 0,lucroTotal = 0, quantidadeMercadorias = 3, lucroMenor10 = 0, lucroMaior10Menor20 = 0, lucroMaior20 = 0;
		String nome;
		for(int i = 0;i < quantidadeMercadorias;i++) {
			System.out.println("Informe o nome do produto o preço de compra e o preço de venda respectivamente: ");
			nome = leitor.next();
			PC = leitor.nextDouble();
			PV = leitor.nextDouble();
			lucro = (PV - PC) / PC * 100;
			PCtotal += PC;
			PVtotal += PV;
			lucroTotal += lucro;
			if(lucro < 10)
				lucroMenor10++;
			else if(lucro >= 10 && lucro <= 20)
				lucroMaior10Menor20++;
			else if(lucro > 20)
				lucroMaior20++;
		}
		System.out.println("O total de mercadorias que tem um lucro menor que 10% é de: " + lucroMenor10);
		System.out.println("O total de mercadorias que tem um lucro maior que 10% e menor que 20% é de: " + lucroMaior10Menor20);
		System.out.println("O total de mercadorias que tem um lucro maior que 20% é de: " + lucroMaior20);

		System.out.println("O preco total de compra das mercadorias vendidas foi de: " + PCtotal);
		System.out.println("O preco total de venda das mercadorias foi de: " + PVtotal);
		System.out.println("O lucro total de venda das mercadorias foi de: " + lucroTotal);
		
		leitor.close();
	}
}
