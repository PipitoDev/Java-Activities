package ExercícosJava_11;

import java.util.Arrays;
import java.util.Random;

public class AtividadeJava_07 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbers = new Integer[10];
        int sum = 0, count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        for (Integer sumLoop : numbers) {
            sum += sumLoop;
        }
        for (Integer verifier : numbers) {
            if (verifier > sum / numbers.length) {
                count++;
            }
        }
        System.out.printf("Os números dentro do Array são: %s %n", Arrays.toString(numbers).replaceAll("[^0-9 ,]", ""));
        System.out.printf("""
                A soma de todos os números é: %d
                A média de todos eles é: %d
                A quantidade de números maiores que a média são: %d %n""", sum, (sum / numbers.length), count);
    }
}
