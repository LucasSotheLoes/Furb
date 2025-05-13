package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número correspondente ao curso escolhido:");
        System.out.println("1 - Ciência da Computação");
        System.out.println("2 - Licenciatura da Computação");
        System.out.println("3 - Sistemas de Informação");
        
        int opcaoCurso = scanner.nextInt();
        String titulo;
        
        switch (opcaoCurso) {
            case 1:
                titulo = "Bacharel em Ciência da Computação";
                break;
            case 2:
                titulo = "Licenciado em Computação";
                break;
            case 3:
                titulo = "Bacharel em Sistemas de Informação";
                break;
            default:
                titulo = "Opção inválida. Por favor, digite um número entre 1 e 3.";
                break;
        }
        
        System.out.println("O título que você vai receber é: " + titulo);
        
        scanner.close();
    }
}
