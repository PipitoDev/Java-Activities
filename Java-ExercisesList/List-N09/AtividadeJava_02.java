package ExercíciosJava_09;

import java.util.Scanner;

public class AtividadeJava_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize, sum = 0;
        String calculation = "";
        System.out.println("Insira quantos números você quer somar:");
        do {
            arraySize = scan.nextInt();
            if (arraySize < 1) {
                System.out.printf("O número %d é inválido, tente outro: %n", arraySize);
            }
        } while (arraySize < 1);
        System.out.println("Agora, insira os números que vão somar:");
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scan.nextInt();
            if (i < (numbers.length) - 1) {
                System.out.println("Próximo:");
            }
        }
        for (int i = 0; i < arraySize; i++) {
            String verifier = (numbers[i] < 0) ? "(" + numbers[i] + ")" : String.valueOf(numbers[i]);
            calculation += verifier;
            if (i < (numbers.length - 1)) {
                calculation += " + ";
            }
        }
        for (int i = 0; i < arraySize; i++) {
            sum += numbers[i];
        }
        System.out.printf("O resultado é: %n%s = %d %n", calculation, sum);
        scan.close();
    }
}
