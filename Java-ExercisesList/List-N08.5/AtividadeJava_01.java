package ExercíciosJava_08_5;

import java.util.Scanner;

public class AtividadeJava_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, numInfo, numLoopVerifier = 0;
        System.out.println("\nInsira um número inteiro e positivo:");
        do {
            num = scan.nextInt();
            scan.nextLine();
            numInfo = num;
            if (num < 0) {
                System.out.println("""
                        O número inserido não é positivo!
                        Tente novamente:""");
            }
        } while (num < 0);
        do {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
            numLoopVerifier = numLoopVerifier + 1;
        } while (num != 1);
        System.out.printf("O número inicial de %d, precisou de %d operações para chegar em 1, seguindos as condições. %n", numInfo, numLoopVerifier);
        scan.close();
    }
}
