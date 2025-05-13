package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao, totalContas = 0;
        String nome;
        int diarias;
        double totalAPagar;

        do {
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            System.out.println("Escolha uma opção:");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    leitor.nextLine(); // Consumir a quebra de linha
                    System.out.println("Informe o nome do hóspede:");
                    nome = leitor.nextLine();
                    System.out.println("Informe o número de diárias:");
                    diarias = leitor.nextInt();

                    if (diarias < 15) {
                        totalAPagar = diarias * 50 + diarias * 7.5;
                    } else if (diarias == 15) {
                        totalAPagar = diarias * 50 + diarias * 6.5;
                    } else {
                        totalAPagar = diarias * 50 + diarias * 5;
                    }

                    System.out.println("Nome do hóspede: " + nome);
                    System.out.println("Total a ser pago: R$ " + totalAPagar);
                    totalContas++;
                    break;
                case 2:
                    System.out.println("Número de contas encerradas: " + totalContas);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        } while (opcao != 3);
    }
}
