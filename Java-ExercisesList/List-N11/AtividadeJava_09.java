package ExercícosJava_11;

import java.util.Arrays;
import java.util.Random;

public class AtividadeJava_09 {
    public static void main(String[] args) {
        Random random = new Random();
        Character[] letras = new Character[20];
        int count = 0;
        for (int i = 0; i < letras.length; i++) {
            letras[i] = (char) (random.nextInt(26) + 65);
        }
        for (Character verifier : letras) {
            if (verifier.toString().matches("[AEIOU]")) {
                count++;
            }
        }
        System.out.printf("""
                No seguinte Array:
                %s
                
                Há %d vogais! %n""", Arrays.toString(letras).replaceAll("[^A-Z ,]", ""), count);
    }
}
