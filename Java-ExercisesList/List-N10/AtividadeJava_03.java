package ExercíciosJava_10;

import java.util.Arrays;
import java.util.Random;

public class AtividadeJava_03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        int verifier = 0, position01 = 0, position02 = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            if (numbers[i] % 2 == 0) {
                verifier ++;
            }
        }
        int[] numbersPairs = new int[verifier];
        int[] numbersOdd = new int[20 - verifier];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbersPairs[position01] = numbers[i];
                position01 ++;
            } else {
                numbersOdd[position02] = numbers[i];
                position02 ++;
            }
        }
        System.out.printf("""
                Os números do array eram: %s
                O segundo array pegou os: %s
                O segundo array não pegou os: %s %n""", Arrays.toString(numbers), Arrays.toString(numbersPairs), Arrays.toString(numbersOdd));
    }
}
