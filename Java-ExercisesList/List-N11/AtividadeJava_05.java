package ExercícosJava_11;

import java.util.Scanner;

public class AtividadeJava_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] multipliers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Insira um número para ver a tabuada de multiplicação de 1 a 10:");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("A tabuada do número " + num + " é:");
        for (Integer numbers : multipliers) {
            System.out.printf("%d x %d = %d %n", num, numbers, (num*numbers));
        }
        scan.close();
    }
}
