package semestre2.poo.prova02;

public class Veiculo implements Relatorio{
	private String Placa;
	private int km;
	private double precoDiaria;
	private Categoria categoria;
	
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public double getPrecoDiaria() {
		return precoDiaria;
	}
	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public String imprimir() {
		String oi = "Informações dos veiculos"
				+ "\nPlaca: " + getPlaca()
				+ "\nKm: " + getKm()
				+ "\nCategoria " + getCategoria()
				+ "\nValor diaria " + getPrecoDiaria();
		return oi;
	}
	
}
