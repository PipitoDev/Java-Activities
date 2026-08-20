package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN1_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Insira o número limite para ser exibido:");
        num = scan.nextInt();
        scan.nextLine();
        if (num >= 0) {
            for(int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= num; i--) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
