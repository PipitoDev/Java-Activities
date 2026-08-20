package ExercíciosJava_08_5;

import java.util.Scanner;

public class AtividadeJava_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade, grade1 = 0, grade2 = 0, grade3 = 0, average, bigger, lower, mid;
        int loopVerifier = 0;
        System.out.println("Insira a primeira nota:");
        do {
            grade = scan.nextDouble();
            if (grade >= 0 && grade <= 10) {
                switch (loopVerifier) {
                    case 0 -> grade1 = grade;
                    case 1 -> grade2 = grade;
                    case 2 -> grade3 = grade;
                }
                if (loopVerifier < 2) {
                    System.out.println("Próxima nota:");
                }
                loopVerifier = loopVerifier + 1;
            } else {
                System.out.println("Essa nota é inválida, tente novamente:");
            }
        } while (loopVerifier < 3);
        bigger = Math.max(grade1, Math.max(grade2, grade3));
        lower = Math.min(grade1, Math.min(grade2, grade3));
        mid = (grade1 + grade2 + grade3) - (bigger + lower);
        bigger = bigger * 5;
        lower = lower * 2;
        mid = mid * 3;
        average = (bigger + lower + mid) / (5 + 3 + 2);
        if (average >= 7 && grade1 >= 4 && grade2 >= 4 && grade3 >= 4) {
            System.out.printf("Aprovado Especial! A média foi: %.1f. %n", average);
        } else {
            if (average >= 7) {
                System.out.printf("Não se qualificou! A média foi: %.1f, mas houve nota(s) inferior a 4. %n", average);
            } else {
                System.out.printf("Não se qualificou! A média foi: %.1f. %n", average);
            }
        }
        scan.close();
    }
}
