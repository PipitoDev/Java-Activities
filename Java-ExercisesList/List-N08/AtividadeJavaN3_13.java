package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN3_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, count = 0;
        System.out.println("Insira 10 números:");
        for (int i = 1; i <= 10; i++) {
            num = scan.nextInt();
            scan.nextLine();
            if (num % 2 == 0) {
                count++;
            }
            if (i < 10) {
                System.out.println("Próximo número:");
            }
        }
        switch (count) {
            case 0 -> System.out.println("Nenhum número par foi inserido.");
            case 1 -> System.out.println("Apenas um número par foi inserido.");
            default -> System.out.printf("Foi inserido %d números pares. %n", count);
        }
        scan.close();
    }
}
