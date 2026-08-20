package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB3_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hoursW, hoursO, answer;
        double hoursWC = 0, hoursOC = 0, hoursD;
        boolean verifier = false, typeHour = false;
        System.out.println("\nInsira quanto tempo a máquina permaneceu ligada:");
        do {
            hoursO = scan.nextLine();
            try {
                if (hoursO.contains(",")) {
                    hoursO = hoursO.replace(",", ".");
                }
                if (hoursO.contains(":")) {
                    hoursO = hoursO.replace(":", ".");
                    typeHour = true;
                } else if (hoursO.contains(";")) {
                    hoursO = hoursO.replace(";", ".");
                    typeHour = true;
                }
                hoursOC = Double.parseDouble(hoursO);
                if (typeHour) {
                    hoursOC = hoursOC + ((hoursOC%1 * 60) / 100);
                }
                if (hoursOC > 0) {
                    verifier = true;
                } else {
                    System.out.println("""
                            Não há como a máquina ter ficado desligada ou ter horas negativas para calcular.
                            Tente novamente:""");
                }
            } catch (NumberFormatException e) {
                System.out.println("Você inseriu uma informação inválida, tente novamente:");
            }
        } while (!verifier);
        verifier = false;
        typeHour = false;
        System.out.println("Insira o tempo em que ela produziu:");
        do {
            hoursW = scan.nextLine();
            try {
                if (hoursW.contains(",")) {
                    hoursW = hoursW.replace(",", ".");
                }
                if (hoursW.contains(":")) {
                    hoursW = hoursW.replace(":", ".");
                    typeHour = true;
                } else if (hoursW.contains(";")) {
                    hoursW = hoursW.replace(";", ".");
                    typeHour = true;
                }
                hoursWC = Double.parseDouble(hoursW);
                if (typeHour) {
                    hoursWC = hoursWC + ((hoursWC%1 * 60) / 100);
                }
                if (hoursWC <= hoursOC && hoursWC >= 0) {
                    verifier = true;
                } else {
                    System.out.println("""
                            Não há como a máquina ter tido mais horas de produção que ligada e nem ter tempo negativo.
                            Tente novamente:""");
                }
            } catch (NumberFormatException e) {
                System.out.println("Você inseriu uma informação inválida, tente novamente:");
            }
        } while (!verifier);
        verifier = false;
        System.out.println("Você seseja o resultado em horas ou minutos?");
        do {
            answer = scan.nextLine();
            answer = answer.toUpperCase();
            hoursD = (hoursWC / hoursOC) * 100;
            if (answer.contains("HORAS") || answer.contains("MINUTOS")) {
                verifier = true;
            } else {
                System.out.println("Não consegui entender, tente de novo:");
            }
        } while (!verifier);
        if (answer.contains("HORAS") || answer.contains("MINUTOS")) {
            if (answer.contains("HORAS")) {
                System.out.printf("A máquina teve uma disponibilidade de %.1f%% das horas totais. %n", hoursD);
            } else if (answer.contains("MINUTOS")) {
                System.out.printf("A máquina teve uma disponibilidade de %.1f%% dos minutos totais. %n", hoursD);
            } else {
                System.out.println("Não consegui entender, tente de novo:");
            }
            if (answer.contains("POR FAVOR")) {
                System.out.println("Ain, que fofo (～￣▽￣)～");
            }
        }
        scan.close();
    }
}
