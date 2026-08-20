package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB5_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int piecesG = 0, piecesD = 0;
        String answer;
        System.out.println("Insira 'OK' para boa e 'NO' para defeituosas.");
        do {
            if (piecesG + piecesD < 50) {
                System.out.println("Condição da peça:");
            }
            answer = scan.nextLine();
            answer = answer.toUpperCase();
            if (answer.equals("OK")) {
                piecesG = piecesG + 1;
            } else if (answer.equals("NO")) {
                piecesD = piecesD + 1;
            } else {
                System.out.println("Informação errada. Use apenas 'OK' para boas e 'NO' para defeituosas:");
            }
        } while (piecesG + piecesD < 50);
        System.out.printf("""
                A quantidade de peças boas: %d
                A quantidade de peças defeituosas: %d""", piecesG, piecesD);
        scan.close();
    }
}
