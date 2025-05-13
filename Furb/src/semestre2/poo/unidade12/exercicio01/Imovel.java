package semestre2.poo.unidade12.exercicio01;

import javax.swing.JOptionPane;

public class Imovel {
	private String endereco;
	private int area;
	private Bairro bairro;
	private Finalidade finalidade;
	
	public Imovel(){}
	
	public Imovel(String endereco,int area,Bairro bairro,Finalidade finalidade){
		this.endereco = endereco;
		this.area = area;
		this.bairro = bairro;
		this.finalidade = finalidade;
	}

	public Finalidade getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(Finalidade finalidade) {
		if(finalidade == null)
			throw new IllegalArgumentException("A finalidade deve ser informada");
		else
			this.finalidade = finalidade;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		try {
		if(area <= 0)
			JOptionPane.showMessageDialog(null, "Informe uma area maior do que 0");
		else
			this.area = area;
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Informe a area em números");
		} catch(RuntimeException e) {
			JOptionPane.showMessageDialog(null, "Vixe algo deu errado");
		}
	}
	
	public Bairro getBairro() {
		return bairro;
	}
	
	public void setBairro(Bairro bairro) {
		if(bairro == null)
			throw new IllegalArgumentException("O bairro deve ser informado");
		else
			this.bairro = bairro;
	}
	public double calcularIptu() {
		while(true) {
		if(finalidade == Finalidade.RESIDENCIAL) 
			return area * 1;
		 else if(finalidade == Finalidade.COMERCIAL) {
			if(area <= 100)
				return 500;
			else if(area >= 100 && area <= 400)
				return 1000;
			else if(area > 400)
				return area * 2.55;
		} else if(finalidade == Finalidade.INDUSRTIAL)
			if(area <= 2000)
				return 1000;
			else
				return area * 0.55;
		else {
			JOptionPane.showMessageDialog(null, "A finalidade do imovel deve ser informada");
			return 0;
		}
		}
		
	}

}
