package semestre2.poo.unidade06.exercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FuncionarioTest {
	@Test
	public void teste01() {
		Funcionario funcionario = new Funcionario(null,850.00);
			assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
	}
	@Test
	public void teste02() {
		Funcionario funcionario = new Funcionario(null,1903.98);
			assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
	}
	@Test
	public void teste03() {
		Funcionario funcionario = new Funcionario(null,1903.99);
			assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
	}
	@Test
	public void teste04() {
		Funcionario funcionario = new Funcionario(null,2000.00);
			assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
			assertEquals(7.20, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste05() {
		Funcionario funcionario = new Funcionario(null,2826.65);
			assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
			assertEquals(69.20, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste06() {
		Funcionario funcionario = new Funcionario(null,2826.66);
			assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
			assertEquals(69.20, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste07() {
		Funcionario funcionario = new Funcionario(null,3000.00);
			assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
			assertEquals(95.20, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste08() {
		Funcionario funcionario = new Funcionario(null,3751.05);
			assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
			assertEquals(207.86, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste09() {
		Funcionario funcionario = new Funcionario(null,3751.06);
			assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
			assertEquals(207.86, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste10() {
		Funcionario funcionario = new Funcionario(null,4000.00);
			assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
			assertEquals(263.87, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste11() {
		Funcionario funcionario = new Funcionario(null,4664.68);
			assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
			assertEquals(413.42, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste12() {
		Funcionario funcionario = new Funcionario(null,4664.69);
			assertEquals(FaixaIrpf.QUINTA, funcionario.identificarFaixaIrpf());
			assertEquals(413.42, funcionario.calcularIrpf(),0.01);
	}
	@Test
	public void teste13() {
		Funcionario funcionario = new Funcionario(null,5000.00);
			assertEquals(FaixaIrpf.QUINTA, funcionario.identificarFaixaIrpf());
			assertEquals(505.64, funcionario.calcularIrpf(),0.01);
	}
}
