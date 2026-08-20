package ExercíciosJava_08;

import java.util.Scanner;

public class AtividadeJavaN4_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade;
        int countA = 0, countB = 0;
        System.out.println("Insira as notas dos alunos separadamente:");
        for (int i = 1; i <= 10; i++) {
            do {
                grade = scan.nextDouble();
                if (grade < 0 || grade > 10) {
                    System.out.println("Nota inválida, insira apenas entre 0 e 10:");
                }
            } while (grade < 0 || grade > 10);
            if (grade >= 7) {
                countA++;
            } else {
                countB++;
            }
            if (i < 10) {
                System.out.println("Próxima nota:");
            }
        }
        switch (countA) {
            case 0 -> System.out.println("Nenhum aluno aprovado!");
            case 1 -> System.out.println("Apenas um aluno aprovado!");
            default -> System.out.printf("%d alunos foram aprovados! %n", countA);
        }
        switch (countB) {
            case 0 -> System.out.println("Nenhum aluno reprovado!");
            case 1 -> System.out.println("Apenas um aluno reprovado!");
            default -> System.out.printf("%d alunos foram reprovados! %n", countB);
        }
        scan.close();
    }
}
