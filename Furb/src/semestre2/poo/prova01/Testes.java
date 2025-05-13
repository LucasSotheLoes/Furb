//Lucas Söthe Loes
package semestre2.poo.prova01;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes {

	@Test
	public void testeAltaTemporada8Dias() {
		Estadia estadia = new Estadia(Periodo.ALTA_TEMPORADA,8);
		assertEquals(1411.20, estadia.precoPagar(),0.01);
	}
	@Test
	public void testeMediaTemporada1Dias() {
		Estadia estadia = new Estadia(Periodo.MEDIA_TEMPORADA,1);
		assertEquals(157.5, estadia.precoPagar(),0.01);
	}
	@Test
	public void testeBaixaTemporada5Dias() {
		Estadia estadia = new Estadia(Periodo.BAIXA_TEMPORADA,5);
		assertEquals(525.00, estadia.precoPagar(),0.01);
	}
	@Test
	public void testBaixaTemporada1Dias() {
		Estadia estadia = new Estadia(Periodo.BAIXA_TEMPORADA,1);
		assertEquals(110.25, estadia.precoPagar(),0.01);
	}
	@Test
	public void testeMediaTemporada3Dias() {
		Estadia estadia = new Estadia(Periodo.MEDIA_TEMPORADA,3);
		assertEquals(450.00, estadia.precoPagar(),0.01);
	}
}
