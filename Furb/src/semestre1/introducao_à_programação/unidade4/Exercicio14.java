package semestre1.introducao_à_programação.unidade4;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a data no formato DD/MM/AAAA:");
        String data = scanner.nextLine();
        
        String[] partesDaData = data.split("/");
        int dia = Integer.parseInt(partesDaData[0]);
        int mes = Integer.parseInt(partesDaData[1]);
        int ano = Integer.parseInt(partesDaData[2]);
        
        if (DataValida(dia, mes, ano)) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data não é válida.");
        }
        
        scanner.close();
    }
    
    public static boolean DataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false; 
        }
        
        if (dia < 1 || dia > 31) {
            return false; 
        }
        
        switch (mes) {
            case 4: case 6: case 9: case 11:
                return dia <= 30;
            case 2:
                if (isAnoBissexto(ano)) {
                    return dia <= 29;
                } else {
                    return dia <= 28;
                }
            default:
                return true;
        }
    }
    
    public static boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}

