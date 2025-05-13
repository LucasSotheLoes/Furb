package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double combustivelAbastecido = 0, combustivelTotal= 0, km = 0, kmTotal = 0, parada = 0;
		System.out.println("Quantas paradas foram feitas na viagem: ");
		parada = leitor.nextInt();
		for(int i = 1; i <= parada;i++) {
			System.out.println("Quantas km foram rodados ate a parada " + i);
			km = leitor.nextDouble();
			System.out.println("Quantos litros de combustivel foram abastecidos: ");
			combustivelAbastecido = leitor.nextDouble();
			System.out.println("A média de kilometragem dessa parada foi de: " + km / combustivelAbastecido + "\n");
			kmTotal += km;
			combustivelTotal += combustivelAbastecido;
		}
		System.out.println("A média de kilometragem da viagem foi de: " + kmTotal / combustivelTotal);
		
		leitor.close();
	}
}
