package ExercícosJava_11;

import java.util.Random;

public class AtividadeJava_04 {
    public static void main(String[] args) {
        Random random = new Random();
        Double[] notas = new Double[8];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextDouble(0.0, 10.0 + 1);
        }
        for (Double verifier : notas) {
            if (verifier < 5) {
                System.out.printf("Uma nota verificada é menor que 5! Nota: %.1f %n", verifier);
            }
        }
    }
}
