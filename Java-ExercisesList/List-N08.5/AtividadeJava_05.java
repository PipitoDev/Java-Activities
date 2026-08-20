package ExercíciosJava_08_5;

import java.util.Scanner;

public class AtividadeJava_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String percentInfo;
        double percentC, cityA = 50000, cityB = 150000;
        int year = 0;
        boolean complete = false;
        System.out.println("\nInsira a taxa de crecimento anual da cidade A:");
        do {
            percentInfo = scan.nextLine();
            try {
                if (percentInfo.contains("%")) {
                    percentInfo = percentInfo.replace("%", "");
                }
                if (percentInfo.contains(",")) {
                    percentInfo = percentInfo.replace(",", ".");
                }
                year = year + 1;
                percentC = Double.parseDouble(percentInfo);
                percentC = percentC / 100;
                    cityA = cityA + (cityA * percentC);
                    cityB = cityB + (cityB * 0.015);
                    System.out.printf("""
                            Ano %d
                            A cidade A tem %.0f habitantes.
                            A cidade B tem %.0f habitantes. %n""", year, cityA, cityB);
                    if (cityA > cityB) {
                        complete = true;
                    } else if (cityB - cityA < 10000 || year % 5 == 0) {
                        System.out.println("Alerta: Cidades se aproximando de tamanho!");
                        System.out.println("Próximo crescimento anual:");
                    } else {
                        System.out.println("Próximo crescimento anual:");
                    }
            } catch (NumberFormatException e) {
                System.out.println("Informação inválida, tente novamente:");
            }
        } while (!complete);
        System.out.println("A quantidade de habitantes da cidade A superou a cidade B.");
        scan.close();
    }
}
