package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosNenhumDeNos = 0, votosCPM22 = 0, votosSkank = 0, votosJotaQuest = 0;
        int totalVotos = 0;

        while (true) {
            System.out.println("Mais um voto: s (SIM) / n (NÃO)?");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }

            System.out.println("Digite o código do conjunto (1 a 4):");
            int codigo = scanner.nextInt();

            if (codigo >= 1 && codigo <= 4) {
                switch (codigo) {
                    case 1:
                        votosNenhumDeNos++;
                        break;
                    case 2:
                        votosCPM22++;
                        break;
                    case 3:
                        votosSkank++;
                        break;
                    case 4:
                        votosJotaQuest++;
                        break;
                }
                totalVotos++;
            }

            // Limpa o buffer do scanner para a próxima entrada de texto
            scanner.nextLine();
        }

        System.out.println("Total de votos para Nenhum de Nós: " + votosNenhumDeNos);
        System.out.println("Percentual de votos para Nenhum de Nós: " + (100.0 * votosNenhumDeNos / totalVotos) + "%");

        System.out.println("Total de votos para CPM22: " + votosCPM22);
        System.out.println("Percentual de votos para CPM22: " + (100.0 * votosCPM22 / totalVotos) + "%");

        System.out.println("Total de votos para Skank: " + votosSkank);
        System.out.println("Percentual de votos para Skank: " + (100.0 * votosSkank / totalVotos) + "%");

        System.out.println("Total de votos para Jota Quest: " + votosJotaQuest);
        System.out.println("Percentual de votos para Jota Quest: " + (100.0 * votosJotaQuest / totalVotos) + "%");

        int maxVotos = Math.max(Math.max(votosNenhumDeNos, votosCPM22), Math.max(votosSkank, votosJotaQuest));
        String conjuntoVencedor = "";

        if (maxVotos == votosNenhumDeNos) {
            conjuntoVencedor = "Nenhum de Nós";
        } else if (maxVotos == votosCPM22) {
            conjuntoVencedor = "CPM22";
        } else if (maxVotos == votosSkank) {
            conjuntoVencedor = "Skank";
        } else if (maxVotos == votosJotaQuest) {
            conjuntoVencedor = "Jota Quest";
        }

        System.out.println("O conjunto vencedor é: " + conjuntoVencedor);

        scanner.close();
    }
}