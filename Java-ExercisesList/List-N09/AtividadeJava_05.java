package ExercíciosJava_09;

import java.util.Arrays;

public class AtividadeJava_05 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Seus grandiosos números de trás para frente:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%d, ", numbers[i]);
            } else {
                System.out.printf("%d. %n", numbers[i]);
            }
        }
    }
}
