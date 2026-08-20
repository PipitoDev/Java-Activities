package ExercíciosJava_10;

import java.util.Random;
import java.util.Scanner;

public class AtividadeJava_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Integer multiplier;
        Byte verifier = 0;
        System.out.println("\nInsira o valor que irá múltiplicar os valores do Array B:");
        multiplier = scan.nextInt();
        scan.nextLine();
        Integer[] A = new Integer[10];
        Integer[] B = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(51);
            B[i] = (A[i] * multiplier);
        }
        System.out.println("O valores do Array A são:");
        for (int i = 0; i < A.length; i++) {
            if (i < A.length - 1) {
                if (verifier < 4) {
                    System.out.print(A[i] + "; ");
                    verifier++;
                } else {
                    System.out.println(A[i] + "; ");
                    verifier = 0;
                }
            } else {
                System.out.println(A[i] + ".");
            }
        }
        verifier = 0;
        System.out.println("\nOs valores do Array B viraram:");
        for (int i = 0; i < B.length; i++) {
            if (i < B.length - 1) {
                if (verifier < 4) {
                    System.out.print(B[i] + "; ");
                    verifier++;
                } else {
                    System.out.println(B[i] + "; ");
                    verifier = 0;
                }
            } else {
                System.out.println(B[i] + ".");
            }
        }
        scan.close();
    }
}
