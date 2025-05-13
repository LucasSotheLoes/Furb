package semestre2.poo.unidade09.exercicio2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Teste {
	
	@Test
    public void teste01() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.sacar(250);
        Movimento movimento = conta.getMovimento().get(0);
        Movimento movimento2 = conta.getMovimento().get(1);
        assertEquals(movimento.getTipoMovimento(),TipoMovimento.credito);
        assertEquals(movimento.getValor(),1000,0.001);
        assertEquals(movimento2.getTipoMovimento(),TipoMovimento.debito);
        assertEquals(movimento2.getValor(),250,0.001);
    }
}