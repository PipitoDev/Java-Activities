package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB4_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;
        System.out.println("Insira a data da última manutenção:");
        do {
            day = scan.nextInt();
            scan.nextLine();
            if (day < 1 || day > 31) {
                System.out.println("Essa data não é válida, tente novamente:");
            }
        } while (day < 1 || day > 31);
        System.out.println("A última mmanutenção foi no dia " + day + ".");
        scan.close();
    }
}
