package ExercícosJava_11;

import java.util.Random;
import java.util.Scanner;

public class AtividadeJava_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int arraySize;
        Integer sum = 0;
        System.out.println("Diga o tamanho do Array:");
        do {
            arraySize = scan.nextInt();
            scan.nextLine();
            if (arraySize <= 0 || arraySize > 100) {
                System.out.println("""
                    O Array não pode conter esse valor.
                    Tente novamente:""");
            }
        } while (arraySize <= 0 || arraySize > 100);
        Integer[] numbers = new Integer[arraySize];
        System.out.println("Você quer inserir os números ou randomizar?");
        boolean loopCondition = false;
        byte arrayValueType = 0;
        do {
            String userAnswer = scan.nextLine();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.contains("inserir")) {
                arrayValueType = 1;
                loopCondition = true;
            } else if (userAnswer.contains("random")) {
                loopCondition = true;
            } else {
                System.out.println("""
                        Não entendi, tente ser mais claro:""");
            }
        } while(!loopCondition);
        if (arrayValueType == 1) {
            System.out.printf("""
                    Insira os valores do Array:
                    >O Array tem espaço para %d informações< %n""", numbers.length);
            for(int i = 0; i < numbers.length; i++) {
                System.out.printf("""
                        Insira o %d৹n valor:
                        >Restam %d valores por vir< %n""", (i + 1), (numbers.length - (i + 1)));
                numbers[i] = scan.nextInt();
                scan.nextLine();
            }
        } else {
            System.out.println("Você quer que os valores aleatórios do Array vão de...?");
            int minimumRandom = scan.nextInt();
            scan.nextLine();
            System.out.println("Até...?");
            int maximumRandom = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(minimumRandom, maximumRandom + 1);
            }
            System.out.println("O Array está completo!");
        }
        System.out.println("Você quer somar, subtrair ou múltiplicar o Array todo?");
        loopCondition = false;
        do {
            String userAnswer = scan.nextLine();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.contains("somar")) {
                arrayValueType = 1;
                loopCondition = true;
            } else if (userAnswer.contains("subtrair")) {
                arrayValueType = 2;
                loopCondition = true;
            } else if (userAnswer.contains("múltiplicar") || userAnswer.contains("multiplicar")) {
                arrayValueType = 3;
                loopCondition = true;
            } else {
                System.out.println("""
                        Não entendi, tente ser mais claro:""");
            }
        } while (!loopCondition);
        if (arrayValueType == 1) {
            for (Integer numbersLoop : numbers) {
                sum += numbersLoop;
            }
        } else if (arrayValueType == 2) {
            for (Integer numbersLoop : numbers) {
                sum -= numbersLoop;
            }
        } else {
            sum = 1;
            for (Integer numbersLoop : numbers) {
                sum *= numbersLoop;
            }
        }
        System.out.println("O resultado do Array é: " + sum);
        scan.close();
    }
}
