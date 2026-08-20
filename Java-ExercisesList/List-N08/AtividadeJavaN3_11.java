package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN3_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, bigger = 0;
        System.out.println("Insira 5 números:");
        for (int i = 1; i <= 5; i++) {
            num = scan.nextInt();
            scan.nextLine();
            if (i == 1 || num > bigger) {
                bigger = num;
            }
            if (i < 5) {
                System.out.println("Próximo número:");
            }
        }
        System.out.printf("O maior número entre todos é o %d. %n", bigger);
        scan.close();
    }
}
