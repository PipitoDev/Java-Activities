package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN2_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Insira o número limite das somas:");
        do {
            num = scan.nextInt();
            scan.nextLine();
            if (num == 0) {
                System.out.println("O limite não pode ser 0, tente novamente:");
            }
        } while (num == 0);
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                System.out.printf("%d + %d = %d %n", i, i, i + i);
            }
        } else {
            for (int i = -1; i >= num; i--) {
                System.out.printf("(%d) + (%d)= %d %n", i, i, i + i);
            }
        }
        scan.close();
    }
}
