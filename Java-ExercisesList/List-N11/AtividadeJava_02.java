package ExercícosJava_11;

import java.util.Scanner;

public class AtividadeJava_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cityNames = new String[5];
        System.out.println("Insira 5 nomes de cidades:");
        for (int i = 0; i < cityNames.length; i++) {
            cityNames[i] = scan.nextLine();
            if (i < cityNames.length - 1) {
                System.out.println("Próxima cidade:");
            }
        }
        System.out.println("As cidades que você inseriu foram:\n");
        for (String names : cityNames) {
            System.out.println(names);
        }
        scan.close();
    }
}
