package semestre1.introducao_à_programação.unidade5;

public class Exercicio02 {
	public static void main(String[]args) {
	int adicaoPar = 0,adicaoImpar = 0;	
	for(int i = 1;i <= 100;i++)
		if(i % 2 == 0)
		adicaoPar += i;
		else
		adicaoImpar += i;
	System.out.println("A soma dos pares deu: " + adicaoPar + "\nA soma dos impares deu: " + adicaoImpar);
	
	}
}
