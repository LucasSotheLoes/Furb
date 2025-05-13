package semestre2.poo.unidade12.exercicio01;

import javax.swing.JOptionPane;

public class Bairro {
	private String nome;
	private double coeficienteIptu;
	
	
	public Bairro(){
	}
	public Bairro(String nome,double coeficienteIptu){
		this.nome = nome;
		this.coeficienteIptu = coeficienteIptu;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCoeficienteIptu() {
		return coeficienteIptu;
	}

	public void setCoeficienteIptu(double coeficienteIptu) {
		
			if(coeficienteIptu <= 0)
				JOptionPane.showMessageDialog(null, "Informe um coeficiente maior do que 0");
			else
				this.coeficienteIptu = coeficienteIptu;
			
	}

}
