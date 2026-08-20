package ExercíciosJava_10;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeJava_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array01 = new String[12];
        String[] array02 = new String[array01.length / 2];
        System.out.println("Insira informações quaisquer no array:");
        for (int i = 0; i < array01.length; i++) {
            array01[i] = scan.nextLine();
            if (i < array01.length - 1) {
                System.out.println("Próximo dado:");
            }
            if (i <= 5) {
                array02[i] = array01[i];
            }
        }
        System.out.println("\nO seu Array foi:");
        System.out.println(Arrays.toString(array01));
        for (int i = 0; i < array01.length; i++) {
            if (i <= 5) {
                array01[i] = array01[i + 6];
            } else {
                array01[i] = array02[i - 6];
            }
        }
        System.out.println("\nO seu Array alterado foi:");
        System.out.println(Arrays.toString(array01));
        scan.close();
    }
}
