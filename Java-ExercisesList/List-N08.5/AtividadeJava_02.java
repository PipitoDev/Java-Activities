package ExercíciosJava_08_5;

public class AtividadeJava_02 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3, numSum = 0;
        do {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            if (num3 % 2 != 0 && num3 % 3 == 0) {
                numSum = numSum + num3;
            }
        } while (num3 < 50000);
        System.out.printf("%nA soma total foi: %d %n", numSum);
    }
}
