package semestre1.introducao_à_programação.prova2;
import java.util.Scanner;

public class AtividadeProva2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int pesoMaximo, quantidadeMaxima, pesoInserido = 0,quantidadeInserida= 0, opcao = 0, itemMaisPesado = Integer.MIN_VALUE;
		System.out.println("Informe o peso maximo da espa�onave: ");
		pesoMaximo = scanner.nextInt();
		
		System.out.println("Informe a quantidade maxima de objetos dentro da espa�onave: ");
		quantidadeMaxima = scanner.nextInt();
		
		int []peso = new int[quantidadeMaxima];
		String []valor = new String[quantidadeMaxima];
		
		do {
			System.out.println("Escolha uma das o��es\nInserir valor[1]\nImprimir espa�onave[2]\nValor do item mais pesado[3]\nOrdenar espa�onave[4]\nExcluir item[5]\nSair do progama[6]");
		opcao = scanner.nextInt();
		switch (opcao) {
        case 1:
        	quantidadeInserida = inserir(scanner, peso, quantidadeInserida, valor, pesoMaximo, pesoInserido, quantidadeMaxima);
            break;
        case 2:
        	imprimirEspaconave(scanner, peso, valor, quantidadeInserida);
            break;
        case 3:
        	itemMaisPesado = itemDeMaiorPeso(peso, itemMaisPesado, quantidadeInserida);
            break;
        case 4:
        	ordenarEspaconave(peso, valor, quantidadeInserida);
            break;
        case 5:
            excluirItemEspaconave(scanner, peso, valor, quantidadeInserida, pesoInserido);
            break;
        case 6:
        	System.out.println("Saindo do progama");
        	break;
			}
		} while(opcao != 6);
	}
	private static int inserir(Scanner scanner, int[] peso, int quantidadeInserida, String[] valor, int pesoMaximo, int pesoInserido, int quantidadeMaxima) {
		if(pesoInserido < pesoMaximo && quantidadeInserida != quantidadeMaxima) {
			System.out.println("Informe o peso do item a ser inserido: ");
			int pesoItem = scanner.nextInt();
			System.out.println("Informe o nome do item a ser inserido: ");
			String nomeItem = scanner.next();
			if((pesoInserido += pesoItem) < pesoMaximo) {
				peso[quantidadeInserida] = pesoItem;
				valor[quantidadeInserida] = nomeItem;
				quantidadeInserida++;
				System.out.println("Item adicionado com sucesso!!!");
			} else
			System.out.println("O peso do item + o peso inserido ultrapassam o limite da espa�onave!!!");
			System.out.println("Espa�onave atual");
			for(int i = 0;i < quantidadeInserida ;i++)
				System.out.print(valor[i] + "  ");
			
			System.out.println("\nPessos:");
			
			for(int i = 0;i < quantidadeInserida ;i++)
				System.out.print(peso[i] + "  ");	
			
		} else
			System.out.println("A quantidade ou o peso limite foi atingido(a)");
		return quantidadeInserida;
	}
	private static void imprimirEspaconave(Scanner scanner,int[] peso, String[] valor, int quantidadeInserida) {
		System.out.println("Espa�onave atual");
		System.out.println("Nomes:");
		for(int i = quantidadeInserida - 1; i >= 0;i--)
			System.out.print(valor[i] + "  ");
		
		System.out.println("\nPessos:");
		
		for(int i = quantidadeInserida - 1; i >= 0;i--)
			System.out.print(peso[i] + "  ");
	}
	private static int itemDeMaiorPeso(int[] peso, int maiorPeso, int quantidadeInserida) {
		  for(int i = 0; i < quantidadeInserida;i++) {
            if (peso[i] > maiorPeso)  
              maiorPeso = peso[i];
            }
		  System.out.println("O maior peso: " + maiorPeso);
		return maiorPeso;
		  }
	private static void ordenarEspaconave(int[] peso, String[] valor,int quantidadeInserida) {
	        for (int i = 0; i < quantidadeInserida-1; i++) {
	            for (int j = 0; j < quantidadeInserida-i-1; j++) {
	                if (peso[j] > peso[j+1]) {
	                    int temp = peso[j];
	                    peso[j] = peso[j+1];
	                    peso[j+1] = temp;
	                    String valorPraTrocar = valor[j];
	                    valor[j] = valor[j+1];
	                    valor[j+1] = valorPraTrocar;
	                }
	            }
	        }
	        System.out.println("Espa�onave ordenada com sucesso!!!");
		}
	private static void excluirItemEspaconave(Scanner scanner, int[]peso, String[] valor, int quantidadeInserida, int pesoAtual) {
		System.out.println("Informe o valor do item que o nome do item que voce deseja excluir: ");
		String nomeItemExcluir = scanner.next();
		int n = 0;
		for(int i = 0; i < quantidadeInserida;i++) {
			if(valor[i].equalsIgnoreCase(nomeItemExcluir)) {
				valor[i] = null;
				pesoAtual -= peso[i];
				peso[i] = 0;
				quantidadeInserida--;
				System.out.println("Item excluido com sucesso!!!");
				n++;
			}
		}
		if(n == 0)
			System.out.println("Item n�o encontrado!!!");
 
		}
	}
 