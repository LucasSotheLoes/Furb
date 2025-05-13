package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner pingo = new Scanner(System.in);
        double[] lados = new double[3];

        System.out.println("Insira o valor dos 3 lados respectivamente: ");
        for (int i = 0; i < lados.length; i++) {
            lados[i] = pingo.nextDouble();
        }

        if (lados[0] < (lados[1] + lados[2]) && lados[1] < (lados[0] + lados[2]) && lados[2] < (lados[0] + lados[1])) {
            if (lados[0] == lados[1] && lados[0] == lados[2]) {
                System.out.println("As retas formam um triângulo equilátero.");
            } else if (lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2]) {
                System.out.println("As retas formam um triângulo isósceles.");
            } else {
                System.out.println("As retas formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Não formam um triângulo.");
        }

        pingo.close();
    }
}
