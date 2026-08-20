package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB3_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kWhC, kWhCT = 0;
        String kWh;
        System.out.println("\nInsira o consumo da máquina em kWh:");
        do {
            try {
                do {
                    kWh = scan.nextLine();
                    kWhC = Integer.parseInt(kWh);
                    if (kWhC < 0) {
                        System.out.println("""
                                Não há como receber valores negativos.
                                Tente novamente:""");
                    }
                } while (kWhC < 0);
                kWhCT = kWhCT + kWhC;
            } catch (NumberFormatException e) {
                System.out.println("""
                        Você inseriu uma informação inválida.
                        Tente novamente:""");
            }
        } while (kWhCT < 500);
        System.out.printf("""
                Segundo as informações inseridas, a máquina já consumiu um total de %d kWh. %n""", kWhCT);
        scan.close();
    }
}
