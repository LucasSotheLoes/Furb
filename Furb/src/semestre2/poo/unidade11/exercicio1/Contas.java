package semestre2.poo.unidade11.exercicio1;

import java.util.ArrayList;

public class Contas implements Pagavel{
	private ArrayList<Pagavel> contas = new ArrayList<>();
	
	public void incluirConta(Pagavel c) {
		contas.add(c);
	}

	public ArrayList<Pagavel> getContas() {
		return contas;
	}

	@Override
	public double calcularValorPagar() {
		double totalPagar = 0;
		for(Pagavel p : contas) {
			totalPagar += p.calcularValorPagar();
		}
		return totalPagar;
	}

}
