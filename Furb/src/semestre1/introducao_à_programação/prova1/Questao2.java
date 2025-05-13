package semestre1.introducao_à_programação.prova1;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bairro1,bairro2,bairro3;

        System.out.println("Digite a populacao do primeiro bairro:");
        bairro1 = scanner.nextInt();
        System.out.println("Digite a populacao do segundo bairro:");
        bairro2 = scanner.nextInt();
        System.out.println("Digite a populacao do terceiro bairro:");
        bairro3 = scanner.nextInt();

        System.out.println("Escolha uma op��o:");
        System.out.println("a - maior quantidade de habitantes");
        System.out.println("b - menor quantidade de habitantes");
        System.out.println("c - valores impressos em ordem crescente");
        System.out.println("d - media dos habitantes");
        char opcao = scanner.next().charAt(0);
        int maiorBairro = 0, menorBairro = 0,medioBairro = 0, media = 0;
        
        String bairroMaior = "";
        String bairroMenor = "";
        //calculando a m�dia de habitantes
        media = (bairro1 + bairro2 + bairro3) / 3;
        // vendo qual bairro � maior
        if (bairro1 <= bairro2 && bairro2 <= bairro3) {
        	menorBairro = bairro1;
        	medioBairro = bairro2;
        	maiorBairro = bairro3;
        	bairroMenor = "bairro1";
        	bairroMaior = "bairro3";
        }
        else if (bairro1 <= bairro3 && bairro3 <= bairro2){
        	menorBairro = bairro1;
        	medioBairro = bairro3;
        	maiorBairro = bairro2;
        	bairroMenor = "bairro1";
        	bairroMaior = "bairro2";
      }
      else if (bairro2 <= bairro1 && bairro1 <= bairro3){
    	  menorBairro = bairro2;
    	  medioBairro = bairro1;
    	  maiorBairro = bairro3;
    	  bairroMenor = "bairro2";
    	  bairroMaior = "bairro3";
      }
      else if (bairro2 <= bairro3 && bairro3 <= bairro1){
    	  menorBairro = bairro2;
    	  medioBairro = bairro3;
    	  maiorBairro = bairro1;
    	  bairroMenor = "bairro2";
    	  bairroMaior = "bairro1";
      }
      else if (bairro3 <= bairro1 && bairro1 <= bairro2){
    	  menorBairro = bairro3;
    	  medioBairro = bairro1;
    	  maiorBairro = bairro2;
    	  bairroMenor = "bairro3";
    	  bairroMaior = "bairro2";
      }
      else if (bairro3 <= bairro2 && bairro2 <= bairro1){
    	  menorBairro = bairro3;
    	  medioBairro = bairro2;
    	  maiorBairro = bairro1;
    	  bairroMenor = "bairro3";
    	  bairroMaior = "bairro1";
    	  
      }
        switch (opcao) {
            case 'a':
            	System.out.println("O maior bairro �: " + bairroMaior);
                break;
            case 'b':
            	System.out.println("O menor bairro �: " + bairroMenor);
                break;
            case 'c':
            	System.out.println("Os valores em ordem crescente sao: " + menorBairro + " " + medioBairro + " " + maiorBairro);
                break;
            case 'd':
            	System.out.println("A media da populacao dos bairros e de: " + media);
                break;
            default:
                break;
        }

        scanner.close();
    }
}
