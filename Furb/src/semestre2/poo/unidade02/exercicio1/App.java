package semestre2.poo.unidade02.exercicio1;


public class App {
	public static void main(String[]args) {
		ContaBancaria[] contaBancaria = new ContaBancaria[2];
		
		contaBancaria[0] = new ContaBancaria();
		contaBancaria[1] = new ContaBancaria();
		
		contaBancaria[0].setTitular("Lucas");
		contaBancaria[1].setTitular("João");
		
		contaBancaria[0].depositar(1000);
		contaBancaria[0].depositar(700);
		contaBancaria[1].depositar(5000);
		contaBancaria[1].sacar(3000);
		contaBancaria[1].transferir(contaBancaria[0], 1800);
		
		System.out.println("O titular da primeira conta bancaria é: " + contaBancaria[0].getTitular() +" e seu saldo é:  "+ contaBancaria[0].getSaldo());
		System.out.println("O titular da segunda conta bancaria é: " + contaBancaria[1].getTitular() +" e seu saldo é:  "+ contaBancaria[1].getSaldo());
	}
}
