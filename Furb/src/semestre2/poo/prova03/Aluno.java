package semestre2.poo.prova03;

public class Aluno {
    private String nome;
    private double media;

    public Aluno(String nome, double media) {
        this.nome = nome;
        this.media = media;
    }
    public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
        return nome;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
		this.media = media;
	}
	@Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", media=" + media +
                '}';
    }
}
