package ExercíciosJava_09;

public class AtividadeJava_01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3 ,4 ,5};
        System.out.println("Seus grandiosos números são:");
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.printf("%d, ", numbers[i]);
            } else {
                System.out.printf("%d. %n", numbers[i]);
            }
        }
    }
}
