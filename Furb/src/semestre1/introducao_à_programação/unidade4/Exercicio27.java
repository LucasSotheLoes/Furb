package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a hora de chegada (HH MM):");
        int horaChegada = scanner.nextInt();
        int minutoChegada = scanner.nextInt();
        
        System.out.println("Digite a hora de partida (HH MM):");
        int horaPartida = scanner.nextInt();
        int minutoPartida = scanner.nextInt();
        
        if (horaChegada < 0 || horaChegada > 23 || minutoChegada < 0 || minutoChegada > 59 ||
            horaPartida < 0 || horaPartida > 23 || minutoPartida < 0 || minutoPartida > 59 ||
            (horaPartida < horaChegada) || (horaPartida == horaChegada && minutoPartida < minutoChegada)) {
            System.out.println("Horário inválido. Por favor, digite um horário entre 00 00 e 23 59 e certifique-se de que a partida é após a chegada.");
        } else {
           
            int tempoTotalMinutos = (horaPartida * 60 + minutoPartida) - (horaChegada * 60 + minutoChegada);
            
            int horasEstacionado = tempoTotalMinutos / 60;
            int minutosRestantes = tempoTotalMinutos % 60;
            if (minutosRestantes >= 30) {
                horasEstacionado++;
            }
            
            double precoTotal = 0;
            if (horasEstacionado > 0) {
                if (horasEstacionado <= 2) {
                    precoTotal += horasEstacionado * 5.00;
                } else if (horasEstacionado <= 4) {
                    precoTotal += 2 * 5.00 + (horasEstacionado - 2) * 7.50;
                } else {
                    precoTotal += 2 * 5.00 + 2 * 7.50 + (horasEstacionado - 4) * 10.00;
                }
            }
            
            System.out.println("Tempo estacionado: " + horasEstacionado + " hora(s)");
            System.out.println("Preço a ser cobrado: R$ " + String.format("%.2f", precoTotal));
        }
        
        scanner.close();
    }
}
