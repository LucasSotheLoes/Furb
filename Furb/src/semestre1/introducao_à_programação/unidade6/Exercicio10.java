package semestre1.introducao_à_programação.unidade6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        final int TAMANHO_MAXIMO = 50;
        int[] vetor = new int[TAMANHO_MAXIMO];
        int tamanho = 0;
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Inverter valores");
            System.out.println("8 – Sair do sistema");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    tamanho = incluirValor(scanner, vetor, tamanho, TAMANHO_MAXIMO);
                    break;
                case 2:
                    pesquisarValor(scanner, vetor, tamanho);
                    break;
                case 3:
                    alterarValor(scanner, vetor, tamanho);
                    break;
                case 4:
                    tamanho = excluirValor(scanner, vetor, tamanho);
                    break;
                case 5:
                    mostrarValores(vetor, tamanho);
                    break;
                case 6:
                    ordenarValores(vetor, tamanho);
                    break;
                case 7:
                    inverterValores(vetor, tamanho);
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 8);

        scanner.close();
    }

    private static int incluirValor(Scanner scanner, int[] vetor, int tamanho, int TAMANHO_MAXIMO) {
        if (tamanho >= TAMANHO_MAXIMO) 
            System.out.println("Vetor cheio, não é possível incluir mais valores.");
         else {
            System.out.println("Digite o valor a ser incluído:");
            int valor = scanner.nextInt();
            vetor[tamanho] = valor;
            tamanho++;
            System.out.println("Valor incluído com sucesso.");
        }
        return tamanho;
    }

    private static void pesquisarValor(Scanner scanner, int[] vetor, int tamanho) {
        System.out.println("Digite o valor a ser pesquisado:");
        int valorPesquisa = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorPesquisa) {
                System.out.println("Valor encontrado no vetor.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado no vetor.");
        }
    }

    private static void alterarValor(Scanner scanner, int[] vetor, int tamanho) {
        System.out.println("Digite o valor a ser alterado:");
        int valorAntigo = scanner.nextInt();
        System.out.println("Digite o novo valor:");
        int valorNovo = scanner.nextInt();
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorAntigo) {
                vetor[i] = valorNovo;
                System.out.println("Valor alterado com sucesso.");
                return;
            }
        }
        System.out.println("Número não encontrado.");
    }

    private static int excluirValor(Scanner scanner, int[] vetor, int tamanho) {
        System.out.println("Digite o valor a ser excluído:");
        int valorExcluir = scanner.nextInt();
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorExcluir) {
                for (int j = i; j < tamanho - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                tamanho--;
                System.out.println("Valor excluído com sucesso.");
                return tamanho;
            }
        }
        System.out.println("Valor não encontrado no vetor.");
        return tamanho;
    }

    private static void mostrarValores(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }

    private static void ordenarValores(int[] vetor, int tamanho) {
        Arrays.sort(vetor, 0, tamanho);
        System.out.println("Valores ordenados com sucesso.");
    }

    private static void inverterValores(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
        System.out.println("Valores invertidos com sucesso.");
    }
}
