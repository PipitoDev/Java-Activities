package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB4_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours, hoursTotal = 0;
        System.out.println("\nInsira o tempo de uso do drone:");
        do {
            hours = scan.nextInt();
            scan.nextLine();
            if (hours < 0) {
                System.out.println("Não há como usar horas negativas, tente novamente:");
            } else {
                hoursTotal = hoursTotal + hours;
            }
            if (hoursTotal < 20) {
                System.out.println("Próximo tempo de uso:");
            }
        } while (hoursTotal < 20);
        System.out.println("O drone precisa de manutenção!");
        scan.close();
    }
}
