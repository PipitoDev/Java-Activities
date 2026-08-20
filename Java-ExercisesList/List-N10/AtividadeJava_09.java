package ExercíciosJava_10;

import java.util.Scanner;

public class AtividadeJava_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = 0;
        boolean verifier = false;
        String[] array = new String[15];
        System.out.println("Insira 15 letras dentro do Array:");
        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = scan.nextLine();
                if (array[i].matches("[^a-zA-Z]") || array[i].length() > 1) {
                    System.out.println("Inválido! Tente novamente:");
                } else {
                    verifier = true;
                }
            } while (!verifier);
            if (array[i].matches("[aeiouAEIOU]")) {
                count++;
            }
            if (i < array.length - 1) {
                System.out.println("Próxima letra:");
            }
        }
        System.out.println("Dentro do Array tem " + count + " vogais!");
        scan.close();
    }
}
