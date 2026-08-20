package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB4_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight, weightTotal = 0;
        System.out.println("\nInsira o peso da carga:");
        do {
            weight = scan.nextDouble();
            if (weight < 0) {
                System.out.println("Não há como ter um peso negativo, tente novamente:");
            } else {
                weightTotal = weightTotal + weight;
            }
            if (weightTotal < 1000) {
                System.out.println("Próximo:");
            }
        } while (weightTotal < 1000);
        System.out.printf("A carga total de %.2f Kg superou o limite! %n", weightTotal);
        scan.close();
    }
}
