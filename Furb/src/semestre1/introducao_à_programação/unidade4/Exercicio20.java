package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota da primeira prova:");
        double notaProva1 = scanner.nextDouble();
        
        System.out.println("Digite a nota da segunda prova:");
        double notaProva2 = scanner.nextDouble();
        
        System.out.println("Digite a nota da terceira prova:");
        double notaProva3 = scanner.nextDouble();
        
        System.out.println("Digite a média dos exercícios:");
        double notaExercicios = scanner.nextDouble();
        
        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;
        
        String conceito;
        String mensagem;
        
        if (media >= 9.0) {
            conceito = "A";
            mensagem = "aprovado";
        } else if (media >= 7.5) {
            conceito = "B";
            mensagem = "aprovado";
        } else if (media >= 6.0) {
            conceito = "C";
            mensagem = "aprovado";
        } else if (media >= 4.0) {
            conceito = "D";
            mensagem = "reprovado";
        } else {
            conceito = "E";
            mensagem = "reprovado";
        }
        
        System.out.printf("A média de aproveitamento é: %.2f\n", media);
        System.out.println("O conceito correspondente é: " + conceito);
        System.out.println("O aluno está " + mensagem + ".");
        
        scanner.close();
    }
}
