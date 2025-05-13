package semestre1.introducao_à_programação.prova1;

public class Questao3 {
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		String livro = "Aprendendo Java";
		String editora = "VisualBooks";
		
		if(livro == null && editora == null) {
			System.out.println("Nao � possivel informar os dados");
			System.out.println("Vazio");
		} else {
			System.out.println("livro: " + livro);
		if(editora == null) {
			System.out.println("Editora Vazio");
		} else {
			System.out.println("editora: " + editora);
		}
		}
		System.out.println("Fim");
	}
}
