package ExercíciosJava_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat  df = new DecimalFormat("0.#");
        int arraySize;
        double sum = 0;
        System.out.println("Insira a quantidade de números que você deseja inserir:");
        do {
            arraySize = scan.nextInt();
            scan.nextLine();
            if (arraySize < 1) {
                System.out.println("Não há como a quantidade ser menor  que 1, tente novamente:");
            }
        } while (arraySize < 1);
        double[] numbers = new double[arraySize];
        System.out.println("Agora, insira os números:");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scan.nextDouble();
            sum += numbers[i];
            if (i < arraySize - 1) {
                System.out.println("Próximo número:");
            }
        }
        System.out.println("A média é: " + df.format(sum / arraySize));
        scan.close();
    }
}
