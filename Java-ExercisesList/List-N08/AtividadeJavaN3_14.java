package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN3_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, numSum = 0, verifier = 0;
        System.out.println("Insira seis números:");
        for (int i = 1; i <= 6; i++) {
            num = scan.nextInt();
            scan.nextLine();
            if (num >= 0) {
                numSum += num;
                verifier++;
            }
            if (i < 6) {
                System.out.println("Próximo número:");
            }
        }
        switch (verifier) {
            case 0 -> System.out.println("Nenhum número positivo foi inserido para somar.");
            case 1 -> System.out.printf("Apenas um número positivo foi inserido, o número %d. %n", numSum);
            default -> System.out.printf("A soma de todos os números positivos é: %d. %n", numSum);
        }
        scan.close();
    }
}
