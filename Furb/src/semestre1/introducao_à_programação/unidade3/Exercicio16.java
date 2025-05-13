package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor do troco:");
        int troco = leitor.nextInt();

        int notasDeCem = troco / 100;
        troco %= 100;

        int notasDeDez = troco / 10;
        troco %= 10;

        int notasDeUm = troco;

        System.out.println("O número mínimo de notas para o troco é:");
        System.out.println(notasDeCem + " nota(s) de R$100");
        System.out.println(notasDeDez + " nota(s) de R$10");
        System.out.println(notasDeUm + " nota(s) de R$1");

        leitor.close();
    }
}
