package ExercíciosJava_10;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeJava_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num, sum = 0;
        Integer[] numbers = new Integer[10];
        Integer[] numbersSum = new Integer[numbers.length];
        System.out.println("Insira os números no Array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
            scan.nextLine();
            if (i < numbers.length - 1) {
                System.out.println("Próximo número:");
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            numbersSum[i] = sum;
        }
        System.out.println("\nO seu Array foi:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("\nO seu Array alterado foi:");
        System.out.println(Arrays.toString(numbersSum));
        scan.close();
    }
}
