package ExercíciosJava_08;

public class AtividadeJavaN4_19 {
    public static void main(String[] args) {
        System.out.println(" ");
        for (int i = 10; i >= 0; i--) {
            if (i > 0 && i <= 10) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d. %n", i);
            }
            if (i == 0) {
                System.out.println("Lançamento autorizado!");
            }
        }
    }
}
