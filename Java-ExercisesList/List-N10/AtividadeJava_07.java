package ExercíciosJava_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AtividadeJava_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Byte acertos = 0;
        String[] gabarito = new String[10];
        for (int i = 0; i < gabarito.length; i++) {
            Integer numRandom = random.nextInt(4);
            switch (numRandom) {
                case 0 -> gabarito[i] = "A";
                case 1 -> gabarito[i] = "B";
                case 2 -> gabarito[i] = "C";
                case 3 -> gabarito[i] = "D";
            }
        }
        String[] resposta = new String[gabarito.length];
        System.out.println("""
                \nInsira suas respostas:
                >Use apenas A, B, C ou D<""");
        for (int i = 0; i < resposta.length; i++) {
            boolean verifier = false;
            do {
                resposta[i] = scan.nextLine();
                resposta[i] = resposta[i].trim().toUpperCase();
                if (resposta[i].equals("A") || resposta[i].equals("B") ||
                    resposta[i].equals("C") || resposta[i].equals("D")) {
                    verifier = true;
                } else {
                    System.out.println("""
                            Resposta inválida, tente novamente:
                            >Use apenas A, B, C ou D<""");
                }
            } while (!verifier);
            if (resposta[i].equals(gabarito[i])) {
                acertos++;
            }
            if (i < resposta.length - 1) {
                System.out.println("Próxima resposta:");
            }
        }
        System.out.println("\nO gabarito da prova era:");
        System.out.println(Arrays.toString(gabarito));
        System.out.println("\nSuas respostas foram:");
        System.out.println(Arrays.toString(resposta));
        System.out.println("Você acertou " + acertos + "!");
        scan.close();
    }
}
