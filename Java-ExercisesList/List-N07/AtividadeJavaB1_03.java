package ExercíciosJava_07;

public class AtividadeJavaB1_03 {
    public static void main(String[] args) {
        int pieceTotals1 = 0, pieceTotals2 = 0;
        do {
            pieceTotals1 = pieceTotals1 + 1;
        } while (pieceTotals1 < 50);
        System.out.printf("A quantidade de peças totais 1 é: %d %n", pieceTotals1);
        //ou
        for (int i = 0; i < 50; i++) {
            pieceTotals2 = pieceTotals2 + 1;
        }
        System.out.printf("A quantidade de peças totais 2 é: %d", pieceTotals2);
    }
}
