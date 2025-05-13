package semestre2.poo.unidade07.exercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Teste {
	@Test(expected = IllegalArgumentException.class)
    public void teste01() {
        	Bairro bairro = new Bairro();
        	String endereco = "";
        	int area = -200;
            Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.RESIDENCIAL);
            imovel.setArea(area);
    }
    @Test(expected = IllegalArgumentException.class)
    public void teste02() {
        	Bairro bairro = new Bairro();
        	String endereco = "";
        	int area;
        	double coeficiente = 1;
            Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.RESIDENCIAL);
            imovel.calcularIptu();
    }
    @Test(expected = IllegalArgumentException.class)
    public void teste03() {
        	Bairro bairro = new Bairro();
        	String endereco = "";
        	int area = 250;
        	double coeficiente = 1;
            Imovel imovel = new Imovel(endereco,area,bairro,null);
            imovel.calcularIptu();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void teste04() {
        	String endereco = "";
        	int area;
            Imovel imovel = new Imovel(endereco,area,null,Finalidade.RESIDENCIAL);
            imovel.setBairro(null);
    }
   
	@Test
	public void teste05() {
		String endereco = "Rua bahia 7404", nome = " ";
		int area = 400;
		double coeficiente = 1;
		Bairro bairro = new Bairro(nome,coeficiente);
		Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.RESIDENCIAL);
			assertEquals(400.00,imovel.calcularIptu(),0.01);
	}
	@Test
	public void teste06() {
		String endereco = "Rua bahia 7404", nome = "Passo Manso";
		int area = 80;
		double coeficiente = 1;
		Bairro bairro = new Bairro(nome,coeficiente);
		Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.COMERCIAL);
			assertEquals(500.00,imovel.calcularIptu(),0.01);
	}
	@Test
	public void teste07() {
		String endereco = "Rua bahia 7404", nome = "Passo Manso";
		int area = 250;
		double coeficiente = 1;
		Bairro bairro = new Bairro(nome,coeficiente);
		Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.COMERCIAL);
			assertEquals(1000.00,imovel.calcularIptu(),0.01);
	}
	@Test
	public void teste08() {
		String endereco = "Rua bahia 7404", nome = "Passo Manso";
		int area = 500;
		double coeficiente = 1;
		Bairro bairro = new Bairro(nome,coeficiente);
		Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.COMERCIAL);
			assertEquals(1275.00,imovel.calcularIptu(),0.01);
	}
	@Test
	public void teste09() {
		String endereco = "Rua bahia 7404", nome = "Passo Manso";
		int area = 2000;
		double coeficiente = 1;
		Bairro bairro = new Bairro(nome,coeficiente);
		Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.INDUSTRIAL);
			assertEquals(1000.00,imovel.calcularIptu(),0.01);
	}
	@Test
	public void teste10() {
		String endereco = "Rua bahia 7404", nome = "Passo Manso";
		int area = 3000;
		double coeficiente = 1;
		Bairro bairro = new Bairro(nome,coeficiente);
		Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.INDUSTRIAL);
			assertEquals(1650.00,imovel.calcularIptu(),0.01);
	}
	@Test
	public void teste11() {
		String endereco = "Rua bahia 7404", nome = "Passo Manso";
		int area = 500;
		double coeficiente = 2.5;
		Bairro bairro = new Bairro(nome,coeficiente);
		Imovel imovel = new Imovel(endereco,area,bairro,Finalidade.RESIDENCIAL);
			assertEquals(1250.00,imovel.calcularIptu() * bairro.getCoeficienteIptu(),0.01);
	}
}
