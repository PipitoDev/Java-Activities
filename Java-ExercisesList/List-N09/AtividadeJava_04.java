package ExercíciosJava_09;

import java.util.Random;
import java.util.Scanner;

public class AtividadeJava_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num, count = 0;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-10, 10);
        }
        System.out.println("Insira um número entre -10 e 10:");
        do {
            num = scan.nextInt();
            if (num < -10 || num > 10) {
                System.out.println("Número fora do mínimo ou limite! Tente novamente:");
            }
        } while (num < -10 || num > 10);
        for (int i = 0; i < numbers.length; i++) {
            if (num != numbers[i]) {
                count++;
            } else {
                System.out.println("Seu número é igual a um do sistema!");
                break;
            }
        }
        if (count == numbers.length) {
            System.out.println("Seu número é diferente de todos do sistema!");
        }
        System.out.println("Os números do sistema eram:");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.printf("%d, ", numbers[i]);
            } else {
                System.out.printf("%d. %n", numbers[i]);
            }
        }
        scan.close();
    }
}
