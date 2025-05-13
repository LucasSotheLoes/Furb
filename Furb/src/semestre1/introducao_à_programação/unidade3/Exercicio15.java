package semestre1.introducao_à_programação.unidade3;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro (até 3 dígitos):");
        int numero = leitor.nextInt();

        int[] partes = {numero / 100, (numero % 100) / 10, numero % 10};


        String[] nomes = {"centena(s)", "dezena(s)", "unidade(s)"};

        int contagem = 0;
        for (int parte : partes) {
            System.out.println(parte + " " + nomes[contagem]);
            contagem++;
        }

        leitor.close();
    }
}