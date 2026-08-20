package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN4_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, count = 0;
        boolean verifier = false;
        System.out.println("Insira um número positivo maior que 1:");
        do {
            num = scan.nextInt();
            scan.nextLine();
            if (num <= 1) {
                System.out.println("Número inválido, tente novamente:");
            }
        } while (num <= 1);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        switch (count) {
            case 2 -> System.out.printf("O número %d é primo! %n", num);
            default -> System.out.printf("O número %d não é primo! %n", num);
        }
        scan.close();
    }
}
