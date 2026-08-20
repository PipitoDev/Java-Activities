package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN4_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, divider = 1;
        System.out.println("Insira um número para saber seus divisores:");
        num = scan.nextInt();
        scan.nextLine();
        System.out.printf("Os divisores de %d são: %n", num);
        for (int i = 1; i <= Math.abs(num); i++) {
            if (num % divider == 0) {
                if (divider != num) {
                    System.out.printf("%d, ", divider);
                } else {
                    System.out.printf("%d. %n", divider);
                }
            }
            divider++;
        }
    }
}
