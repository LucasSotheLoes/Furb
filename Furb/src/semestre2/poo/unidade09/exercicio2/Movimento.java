package semestre2.poo.unidade09.exercicio2;
import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {
	private double valor;
	private TipoMovimento tipoMovimento;
	private LocalTime localTime = LocalTime.now();
	private LocalDate localDate = LocalDate.now();
	
	public Movimento(double valor,TipoMovimento tipo) {
		this.tipoMovimento = tipo;
		this.valor = valor;
	}
	
	public LocalTime getHora() {
		return localTime;
	}
	public LocalDate getData() {
		return localDate;
	}
	public double getValor() {
		return valor;
	}
	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}
}
