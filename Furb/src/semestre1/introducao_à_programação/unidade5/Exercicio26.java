package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorMaximo, valorPedagio, distancia;
        int trechosAcimaMaximo = 0,totalTrechos = 0, trechosAceitosAcima150Km = 0;
        System.out.println("Digite o valor máximo de pedágio que Astolfo está disposto a pagar:");
        valorMaximo = scanner.nextDouble();

        while (true) {
            System.out.println("Digite o valor do pedágio:");
            valorPedagio = scanner.nextDouble();

            if (valorPedagio < 0) {
                break;
            }

            System.out.println("Digite a distância do trecho em Km:");
            distancia = scanner.nextDouble();

            if (valorPedagio > valorMaximo) {
                trechosAcimaMaximo++;
            } else if (distancia > 150) {
                trechosAceitosAcima150Km++;
            }

            totalTrechos++;
        }

        System.out.println(trechosAcimaMaximo + " (trechos com valor acima do qual ele nega-se a pagar);");
        System.out.println(totalTrechos + " (quantidade de trechos informados);");
        System.out.println(trechosAceitosAcima150Km + " (trechos acima de 150km com valor aceito por ele).");

        scanner.close();
    }
}
