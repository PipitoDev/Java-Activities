package ExercícosJava_11;

import java.util.Scanner;

public class AtividadeJava_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = new String[10];
        int count = 0;
        System.out.println("Insira as palavras dentro do Array:");
        for (int i = 0; i < words.length; i++) {
            System.out.printf(">Restam %d palavras< %n", words.length - i);
            words[i] = scan.nextLine();
        }
        for (String verifier : words) {
            if (verifier.matches("[a-zA-Z]{6,}")) {
                count++;
            }
        }
        switch (count) {
            case 0 -> System.out.println("Nenhuma palavra inserida tem mais de 5 letras!");
            default -> System.out.printf("Há um total de %d palavras com mais de 5 letras! %n", count);
        }
        scan.close();
    }
}
