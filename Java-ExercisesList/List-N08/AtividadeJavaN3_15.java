package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN3_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, count = 0;
        System.out.println("Insira 8 números separadamente:");
        for (int i = 1; i <= 8; i++) {
            num = scan.nextInt();
            scan.nextLine();
            if (num > 50) {
                count++;
            }
            if (i < 8) {
                System.out.println("Próximo número:");
            }
        }
        switch (count) {
            case 0 -> System.out.println("Nenhum número maior que 50 foi inserido.");
            case 1 -> System.out.println("Apenas um número maior que 50 foi inserido.");
            default -> System.out.printf("Foi inserido %d números maiores que 50. %n", count);
        }
        scan.close();
    }
}
