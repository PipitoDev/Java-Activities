package ExercíciosJava_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AtividadeJava_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num, position = 0, number = 0;
        boolean verifier = false;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(51);
        }
        System.out.println("Insira um número entre 0 e 50:");
        do {
            num = scan.nextInt();
            scan.nextLine();
            if (num < 0 || num > 50) {
                System.out.println("Inválido! Insira apenas números entre 0 e 50!");
            }
        } while (num < 0 || num > 50);
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                position = numbers.length - 1;
                number = numbers[i];
                verifier = true;
                break;
            }
        }
        System.out.println("Os 10 números do sistema são:");
        System.out.println(Arrays.toString(numbers));
        if (verifier) {
            System.out.printf("O número %d é igual ao %d da posição %d. %n", num, number, position);
        } else {
            System.out.printf("O número %d não é igual a nenhum do sistema! %n", num);
        }
        scan.close();
    }
}
