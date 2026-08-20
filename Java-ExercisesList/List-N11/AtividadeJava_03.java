package ExercícosJava_11;

import java.util.Arrays;
import java.util.Random;

public class AtividadeJava_03 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbers = new Integer[15];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        for (Integer verifier : numbers) {
            if (verifier % 2 == 0) {
                count++;
            }
        }
        System.out.println("\nO Array é: " + Arrays.toString(numbers).replaceAll("[^0-9,]", " "));
        System.out.println("Dentro de todos os números do Array, " +count+ " são pares!");
        if (count > 0) {
            System.out.println("\nOs números pares são:");
            for (Integer pairs : numbers) {
                if (pairs % 2 == 0) {
                    System.out.print(pairs + " ");
                }
            }
        }
    }
}
