package semestre2.poo.unidade09.exercicio1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Teste {
	
	 @Test
	    public void teste01() {
	        ContaEspecial contaEspecial= new ContaEspecial();
	        contaEspecial.setLimiteCredito(100);
	        contaEspecial.depositar(20);
	        contaEspecial.sacar(50);
	        assertEquals(contaEspecial.getSaldo(),-30.00,0.01);
	    }
	 @Test
	    public void teste02() {
	        ContaEspecial contaEspecial = new ContaEspecial();
	        contaEspecial.setLimiteCredito(100);
	        contaEspecial.depositar(20);
	        contaEspecial.sacar(120);
	        assertEquals(contaEspecial.getSaldo(),-100.00,0.01);
	    }
	 
	 @Test(expected = RuntimeException.class)
	    public void teste03() {
	        ContaEspecial contaEspecial= new ContaEspecial();
	        contaEspecial.setLimiteCredito(100);
	        contaEspecial.depositar(20);
	        contaEspecial.sacar(120.01);
	    }
}
