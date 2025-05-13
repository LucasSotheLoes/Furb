package semestre2.poo.unidade11.exercicio1;

public class Main {
	public static void main(String[]args) {
		Contas c = new Contas();
		ContaAgua c1 = new ContaAgua(35,8);
		ContaAgua c2 = new ContaAgua(25,9);
		MensalidadeEnsino m = new MensalidadeEnsino(5, 250);
		MensalidadeEnsino m2 = new MensalidadeEnsino(4, 200);
		PrevidenciaPrivada p = new PrevidenciaPrivada();
		p.setValor(500);
		p.investir();
		c.incluirConta(c1);
		c.incluirConta(c2);
		c.incluirConta(m);
		c.incluirConta(m2);
		c.incluirConta(p);
		System.out.println(c.calcularValorPagar());
	}
}
