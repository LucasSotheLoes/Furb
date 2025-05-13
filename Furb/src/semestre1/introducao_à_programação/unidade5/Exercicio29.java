package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valor = 0, cedula20 = 0, cedula10 = 0, cedula5 = 0, cedula2 = 0, cedula1 = 0;

        System.out.println("Digite o valor que deseja sacar:");
        valor = leitor.nextInt();

        cedula20 = valor / 20;
        valor %= 20;

        cedula10 = valor / 10;
        valor %= 10;

        cedula5 = valor / 5;
        valor %= 5;

        cedula2 = valor / 2;
        valor %= 2;

        cedula1 = valor;

        System.out.println("Quantidade mínima de cédulas para o valor solicitado:");
        System.out.println("Cédulas de 20: " + cedula20);
        System.out.println("Cédulas de 10: " + cedula10);
        System.out.println("Cédulas de 5: " + cedula5);
        System.out.println("Cédulas de 2: " + cedula2);
        System.out.println("Cédulas de 1: " + cedula1);

        leitor.close();
    }
}
