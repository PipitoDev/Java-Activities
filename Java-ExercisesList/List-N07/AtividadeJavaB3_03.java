package ExercíciosJava_07;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class AtividadeJavaB3_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0000.0000", symbols);
        String answer;
        int piece = 1, defective = 0;
        double numberS;
        boolean confirm1 = false;
        System.out.println("""
                \nO sistema irá mostrar o número da peça e sua série.
                Após isso, deverá usar 'OK' ou 'DEFEITO' para indicar o estado da peça.
                Deseja iniciar agora? S/N""");
        do {
            String question01 = scan.nextLine();
            question01 = question01.toUpperCase();
            if (question01.trim().equals("S") || question01.trim().isEmpty()) {
                confirm1 = true;
            } else if (question01.equals("N")) {
                System.out.println("""
                        Ok, aguardando...
                        Quando quiser iniciar, precione enter.""");
            } else {
                System.out.println("Resposta inválida, tente novamente:");
            }
        } while(!confirm1);
        System.out.println("Progrma inciado:");
        do {
            numberS = (Math.random() * 9999.9999 - 1 + 1);
            System.out.printf("""
                    %d৹a peça:
                    ID: %s %n""", piece, df.format(numberS));
            piece = piece + 1;
            do {
                answer = scan.nextLine();
                answer = answer.toUpperCase();
                if (answer.trim().equals("OK") || answer.trim().equals("DEFEITO")) {
                    if (answer.trim().equals("DEFEITO")) {
                        defective = defective + 1;
                    }
                } else {
                    System.out.println("Resposta inválida, tente novamente:");
                }
            } while (!answer.trim().equals("OK") && !answer.trim().equals("DEFEITO"));
        } while (defective < 5);
        System.out.println("""
                O programa detectou um número excessivo de peças com defeitos.
                Programa encerrado!""");
        scan.close();
    }
}
