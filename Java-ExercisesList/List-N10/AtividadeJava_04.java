package ExercíciosJava_10;

import java.util.Scanner;

public class AtividadeJava_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[10];
        byte verifier = 0;
        System.out.println("Insira o nomes dos alunos separadamente:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine();
            if (i < names.length - 1) {
                System.out.println("Próximo nome:");
            }
        }
        System.out.println("Sua ordem de nomes:");
        for (int i = 0; i < names.length; i++) {
            if (i < names.length - 1) {
                if (verifier == 0) {
                    System.out.print(names[i] + "; ");
                    verifier ++;
                } else {
                    System.out.println(names[i] + "; ");
                    verifier = 0;
                }
            } else {
                System.out.println(names[i] + ".");
            }
        }
        verifier = 0;
        System.out.println("A ordem inversa::");
        for (int i = names.length - 1; i >= 0; i--) {
            if (i > 0) {
                if (verifier == 0) {
                    System.out.print(names[i] + "; ");
                    verifier ++;
                } else {
                    System.out.println(names[i] + "; ");
                    verifier = 0;
                }
            } else {
                System.out.println(names[i] + ".");
            }
        }
        scan.close();
    }
}
