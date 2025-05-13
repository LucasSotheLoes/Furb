package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int manha, tarde,totalDia,dia, diaMaiorProducao = 0, totalMaiorProducao = 0, totalManha = 0,totalTarde = 0;
        double valorDia;
        while (true) {
            System.out.println("Digite o dia do mês de abril:");
            dia = scanner.nextInt();

            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                continue;
            }

            System.out.println("Digite o total de peças produzidas no turno da manhã:");
             manha = scanner.nextInt();

            System.out.println("Digite o total de peças produzidas no turno da tarde:");
             tarde = scanner.nextInt();

            totalDia = manha + tarde;

            if (dia <= 15) {
                if (totalDia > 100 && manha >= 30 && tarde >= 30) {
                    valorDia = totalDia * 0.8;
                } else {
                    valorDia = totalDia * 0.5;
                }
            } else {
                valorDia = manha * 0.4 + tarde * 0.3;
            }

            System.out.println("Valor recebido no dia " + dia + ": R$" + valorDia);

            if (totalDia > totalMaiorProducao) {
                diaMaiorProducao = dia;
                totalMaiorProducao = totalDia;
            }

            totalManha += manha;
            totalTarde += tarde;

            System.out.println("Novo funcionário (1.sim 2.não)?");
            int resposta = scanner.nextInt();

            if (resposta != 1) {
                break;
            }
        }

        System.out.println("Dia com maior produção: " + diaMaiorProducao);
        System.out.println("Período com maior produção: " + (totalManha > totalTarde ? "Manhã" : "Tarde"));

        scanner.close();
    }
}
