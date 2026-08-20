package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB4_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int material = 100, materialUsed;
        System.out.println("\nInsira quanto do material foi usado:");
        do {
            materialUsed = scan.nextInt();
            scan.nextLine();
            if (materialUsed >= 0 && materialUsed <= material) {
                material = material - materialUsed;
                if (material >= 10) {
                    System.out.println("Mais quanto de material foi usado? Restam " +material);
                }
            } else {
                System.out.println("Não há como usar material negativos e nem usar uma quantidade maior que tem, tente novamente:");
            }
        } while (material >= 10);
        System.out.println("Acabou o material ou resta menos de 10.");
        scan.close();
    }
}
