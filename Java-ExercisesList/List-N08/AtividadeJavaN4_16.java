package ExercíciosJava_08;

public class AtividadeJavaN4_16 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3;
        System.out.println("Os 10 primeiros números da sequência de Fibonacci são:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
