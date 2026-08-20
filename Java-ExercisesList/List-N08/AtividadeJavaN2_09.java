package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN2_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Insira um número para saber sua fatorial(!):");
        num = scan.nextInt();
        scan.nextLine();
        for (int i = Math.abs(num) - 1; i >= 1; i--) {
            num = num * i;
        }
        System.out.printf("A sua fatorial é: %d %n", num);
        scan.close();
    }
}
