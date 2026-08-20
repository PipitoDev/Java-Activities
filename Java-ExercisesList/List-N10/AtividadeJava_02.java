package ExercíciosJava_10;

import java.util.Scanner;

public class AtividadeJava_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nummbers = new int[15];
        int bigger, smaller, biggerPosition = 0, smallerPosition = 0;
        System.out.println("Insira os números dentro do array:");
        System.out.println("Número da posição 0:");
        for (int i = 0; i < nummbers.length; i++) {
            nummbers[i] = scan.nextInt();
            scan.nextLine();
            if (i < nummbers.length - 1) {
                System.out.println("Número da posição " + (i + 1) + ":");
            }
        }
        bigger = nummbers[0];
        smaller = nummbers[0];
        for (int i = 0; i < nummbers.length; i ++) {
            if (nummbers[i] > bigger) {
                bigger = Math.max(bigger, nummbers[i]);
                biggerPosition = i;
            }
            if (nummbers[i] < smaller) {
                smaller = Math.min(smaller, nummbers[i]);
                smallerPosition = i;
            }
        }
        System.out.printf("""
                O maior número inserido é o %d, na posição %d do array.
                O menor número inserido é o %d, na posição %d do array. %n""", bigger, biggerPosition, smaller, smallerPosition);
        scan.close();
    }
}
