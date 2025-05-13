package semestre2.poo.prova03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlunoController {
   
	 public static List<Aluno> lerArquivo(String caminho) throws IOException, NumberFormatException {
	        List<Aluno> alunos = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
	            String linha;
	            while ((linha = reader.readLine()) != null) {
	                String[] partes = linha.split(",");
	                if (partes.length != 2) {
	                    throw new IOException("Formato inválido no arquivo: " + linha);
	                }
	                String nome = partes[0];
	                double media = Double.parseDouble(partes[1]);
	                alunos.add(new Aluno(nome, media));
	            }
	        }
	        return alunos;
	    }
	 
    public static void salvarAlunos(List<Aluno> alunos) throws IOException {
        try (FileWriter writer = new FileWriter("alunos.csv")) {
            for (Aluno aluno : alunos) {
                writer.write(aluno.getNome() + "," + aluno.getMedia() + "\n");
            }
        }
    }
   
    public static double calcularMedia(List<Double> notas) throws NotaInvalidaException {
        double soma = 0;
        for (Double nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new NotaInvalidaException("Nota inválida: " + nota + ". A nota deve estar entre 0 e 10.");
            }
            soma += nota;
        }
        return soma / notas.size();
    }

    public static void main(String[] args) {
        try {

            List<Double> notas = List.of(7.5, 8.0, 9.0);
            double media = calcularMedia(notas);
            System.out.println("Média calculada: " + media);

            List<Aluno> alunos = List.of(
                    new Aluno("João", media),
                    new Aluno("Maria", 9.0),
                    new Aluno("Carlos", 7.0)
            );
            salvarAlunos(alunos);
            System.out.println("Alunos salvos com sucesso!");

            List<Aluno> alunosLidos = lerArquivo("alunos.csv");
            System.out.println("Alunos lidos:");
            for (Aluno aluno : alunosLidos) {
                System.out.println(aluno);
            }
        } catch (NotaInvalidaException e) {
            System.err.println("Erro ao calcular a média: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro de formato numérico no arquivo: " + e.getMessage());
        }
    }
}