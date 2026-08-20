package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN2_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, numSum = 0;
        System.out.println("Insira 5 números para calcular sua média:");
        for (int i = 1; i <= 5; i++) {
            num = scan.nextInt();
            scan.nextLine();
            numSum = numSum + (num);
            if (i < 5) {
                System.out.println("Próximo:");
            }
        }
        System.out.printf("A média deles é: %d %n", numSum / 5);
        scan.close();
    }
}
