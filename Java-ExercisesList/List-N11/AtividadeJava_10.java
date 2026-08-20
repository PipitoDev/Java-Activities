package ExercícosJava_11;

import java.util.Random;
import java.util.Scanner;

public class AtividadeJava_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Integer[] numbers = new Integer[100];
        int num, count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        System.out.println("Insira um número entre 0 e 100:");
        do {
            num = scan.nextInt();
            scan.nextLine();
            if (num < 0 || num > 100) {
                System.out.println("Número inválido, tente novamente:");
            }
        } while (num < 0 || num > 100);
        for (Integer verifier : numbers) {
            if (num == verifier) {
                count++;
            }
        }
        System.out.printf("O seu número >%d< apareceu %dx no Array! %n", num, count);
        System.out.println("Os números no Array eram: \n");
        int textFormat = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                if (textFormat < 10) {
                    System.out.print(numbers[i] + "; ");
                    textFormat++;
                } else {
                    System.out.println(numbers[i] + "; ");
                    textFormat = 1;
                }
            } else {
                System.out.println(numbers[i] + ".");
            }
        }
        scan.close();
    }
}
