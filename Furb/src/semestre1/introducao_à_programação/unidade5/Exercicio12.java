package semestre1.introducao_à_programação.unidade5;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      int n, numeroDentroDoTriangulo = 1;
      System.out.println("Indique a quantidade de linhas que o triângulo de floyd deve ter: ");
      n = leitor.nextInt();
      for(int i = 1; i < n;i++) {
    	  for(int g = 1;g <= i;g++) {
    		  System.out.print(numeroDentroDoTriangulo + "  ");
    		  numeroDentroDoTriangulo++;
    	  }
    	  System.out.println("");
      }
      leitor.close();
    }
}
