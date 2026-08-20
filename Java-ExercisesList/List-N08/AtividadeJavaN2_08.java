package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN2_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Insira um número qualquer:");
        num = scan.nextInt();
        scan.nextLine();
        if (num != 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d %n", num, i, num * i);
            }
        } else {
            System.out.println("Todo número múltiplicado por 0 é 0!");
        }
        scan.close();
    }
}
