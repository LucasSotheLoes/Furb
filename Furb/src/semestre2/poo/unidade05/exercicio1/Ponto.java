package semestre2.poo.unidade05.exercicio1;

public class Ponto {
	private int x;
	private int y;
	
	Ponto(){
	}
	Ponto(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Quadrante identificarQuadrante() {
		if(getX() > 0 && getY() > 0) 
		return Quadrante.PRIMEIRO;
		 else if(getX() > 0 && getY() < 0)
			return Quadrante.QUARTO;
		 else if(getX() < 0 && getY() < 0)
			 return Quadrante.TERCEIRO;
		 else if(getX() < 0 && getY() > 0)
			 return Quadrante.SEGUNDO;
		 else
			 return Quadrante.NENHUM;
	}
	public boolean estaIncidindoSobreX() {
		if(getY() == 0)
			return true;
		else
			return false;
	}
	public boolean estaIncidindoSobreY() {
		if(getX() == 0)
			return true;
		else
			return false;
	}
	public double calcularDistancia(Ponto outroPonto) {
		double distancia = 
		(((getX()  - outroPonto.getX()) * (getX()  - outroPonto.getX())) 
		+
		((getY()  - outroPonto.getY()) * (getY()  - outroPonto.getY())));
		return distancia;
	}
	public static double calcularDistancia(Ponto p1,Ponto p2) {
		double distancia = 
		(((p1.getX()  - p2.getX()) * (p1.getX()  - p2.getX())) 
		+ 
		((p1.getY()  - p2.getY()) * (p1.getY()  - p2.getY())));
		return distancia;
	}
}
