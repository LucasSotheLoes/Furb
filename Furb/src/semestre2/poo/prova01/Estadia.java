//Lucas Söthe Loes
package semestre2.poo.prova01;

public class Estadia {
	private Periodo periodo;
	private int quantidadeDias;
	
	 /**
     * Construtor padrão que recebe parâmetros.
     * @param periodo que representa o periodo da hospedagem.
     * @param quantidadeDias que representa a quantidade de dias da hospedagem.
     */
	public Estadia(Periodo periodo,int quantidadeDias) {
		this.periodo = periodo;
		this.quantidadeDias = quantidadeDias;
	}
	/**
	 * 
	 * @return retorna o periodo da estadia
	 */
	public Periodo getPeriodo() {
		return periodo;
	}
	/**
	 * @param O periodo que está sendo feito a hospedagem
	 * @return retorna o periodo que está sendo sendo a hospedagem 
	 * @exception lança exceção quando o periodo for nulo(vazio)
	 */
	public void setPeriodo(Periodo periodo) {
		 if (periodo == null) {
	            throw new IllegalArgumentException("O periodo não pode ser nulo!!!");
	        }
		this.periodo = periodo;
	}
	/**
	 * 
	 * @return retorna a quantidade total de dias
	 */
	public int getQuantidadeDias() {
		return quantidadeDias;
	}
	/**
	 * @param quantidadedeDias da hospedagem
	 * @return retorna a quantidade dias que o hóspede vai passar no hotel e faz o tratamento de exceções
	 * @exception lança exceção quando a quantidade de dias for menor ou igual a 0
	 * @exception lança exceção quando a quantidade de dias for menor ou igual a 5 e o periodo for ALTA_TEMPORADA
	 */
	public void setQuantidadeDias(int quantidadeDias) {
		 if (quantidadeDias <= 0) {
			 throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero");
		 } if(periodo == Periodo.ALTA_TEMPORADA && quantidadeDias <= 5) {
			 throw new IllegalArgumentException("A quantidade de dias deve ser 5 dias ou mais na alta temporada");
		 }
	    	this.quantidadeDias = quantidadeDias;
	}
	/**
	 * 
	 * @return O preco final a pagar pelo hóspede
	 */
	public float precoPagar() {
		float diariaBase = 150;
		if(quantidadeDias == 1) {
			
			diariaBase *= 1.05;
		}
		float precofinal = 0;
		if(periodo == periodo.BAIXA_TEMPORADA) {
			
			diariaBase *= 0.7;
			precofinal = diariaBase * quantidadeDias;
		} else if(periodo == periodo.ALTA_TEMPORADA) {
			
			diariaBase *= 1.2;
			precofinal = diariaBase * quantidadeDias;
			if(quantidadeDias >=7) {
				precofinal *= 0.98;
			}
		} else if(periodo == periodo.MEDIA_TEMPORADA){
			
			precofinal = diariaBase * quantidadeDias;
		} 
			
		return precofinal;
	}
}
