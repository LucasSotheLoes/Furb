package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = leitor.nextInt();
        
        if (numero % 2 == 0) {
        	System.out.println("o número é par");
        } else {
        	System.out.println("O número é ímpar");
        }
        
        leitor.close();
    }
}