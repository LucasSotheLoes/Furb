package semestre1.introducao_à_programação.unidade5;

public class Exercicio04 {
    public static void main(String[] args) {
        double s = 0.0;
        for (int i = 1; i <= 20; i++) {
            s += (double) (2 * i + 1) / (i * (i + 1));
        }
        System.out.println("O valor de S é: " + s);
    }
}
