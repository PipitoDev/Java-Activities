package ExercícosJava_11;

import java.util.Arrays;
import java.util.Random;

public class AtividadeJava_06 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbers = new Integer[12];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1001);
        }
        int bigger = numbers[0];
        int smaller = numbers[0];
        for (Integer verifier : numbers) {
            bigger = Math.max(bigger, verifier);
            smaller = Math.min(smaller, verifier);
        }
        System.out.printf("""
                O maior valor do Array é: %d
                O menor valor do Array é: %d
                
                O Vetor tem esses valores:
                %s %n""", bigger, smaller, Arrays.toString(numbers));
    }
}
