package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o dia do vencimento (até o dia 10):");
        int diaVencimento = scanner.nextInt();
        
        System.out.println("Digite o dia do pagamento:");
        int diaPagamento = scanner.nextInt();
        
        System.out.println("Digite o valor da prestação:");
        double valorPrestacao = scanner.nextDouble();
        
        double valorAPagar = valorPrestacao;
        int diasDeAtraso = diaPagamento - diaVencimento;
        
        if (diasDeAtraso <= 0) {
            valorAPagar *= 0.90;
            System.out.println("Pagamento em dia. Você ganhou 10% de desconto!");
        } else if (diasDeAtraso <= 5) {
            System.out.println("Pagamento realizado com atraso de até cinco dias. Desconto não aplicado.");
        } else {
            valorAPagar += valorPrestacao * 0.02 * diasDeAtraso;
            System.out.println("Pagamento realizado com atraso de mais de cinco dias. Multa aplicada.");
        }
        
        System.out.printf("O valor a ser pago é: R$ %.2f\n", valorAPagar);
        
        scanner.close();
    }
}
