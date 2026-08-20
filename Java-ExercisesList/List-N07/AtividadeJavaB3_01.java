package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB3_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pieces;
        int piecesC ,piecesTs = 0;
        boolean verifier;
        System.out.println("\nInsira quantas peças foram produzidas nos 5 turnos.");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d° turno: %n", i);
            verifier = false;
            do {
                pieces = scan.nextLine();
                try {
                    piecesC = Integer.parseInt(pieces);
                    if (piecesC >=0) {
                        piecesTs = piecesTs + piecesC;
                        verifier = true;
                    } else {
                        System.out.println("""
                                Não há como ter produzido negativas peças.
                                Tente novamente:""");
                    }
                } catch (NumberFormatException e) {
                    System.out.printf("""
                            A informação inserida de >%s< é inválida
                            Tente novamente: %n""", pieces);
                }
            } while (!verifier);
        }
        System.out.printf("""
                A média do total das peças de todos os turnos é: %d %n""", piecesTs/5);
        scan.close();
    }
}
