package ExercíciosJava_09;

import java.util.Scanner;

public class AtividadeJava_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize, bigger, smaller;
        System.out.println("Insira a quantidade de números para comparar:");
        do {
            arraySize = scan.nextInt();
            scan.nextLine();
            if (arraySize < 1) {
                System.out.println("Quantidade inválida, tente novamente:");
            }
        } while (arraySize < 1);
        int[] numbers = new int[arraySize];
        System.out.println("Insira número:");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scan.nextInt();
            if (i < (numbers.length - 1)) {
                System.out.println("Próximo:");
            }
        }
        bigger = numbers[0];
        smaller = numbers[0];
        for (int i = 0; i < arraySize; i++) {
            bigger = Math.max(bigger, numbers[i]);
            smaller = Math.min(smaller, numbers[i]);
        }
        switch (numbers.length) {
            case 1 -> System.out.printf("Apenas um número, o %d. %n", numbers[0]);
            default -> System.out.printf("O maior número é o %d e o menor o %d. %n", bigger, smaller);
        }
        scan.close();
    }
}
