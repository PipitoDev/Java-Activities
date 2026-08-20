package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB2_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int buttonEffect = 0;
        String button;
        System.out.println("""
                \nInsira como o botão está:
                0 - Estado OK;
                1 - Estado de emergência.""");
        do {
            try {
                button = scan.nextLine();
                buttonEffect = Integer.parseInt(button);
                if (buttonEffect < 0 || buttonEffect > 1) {
                    System.out.println("Nenhuma função para esse número. Tente de novo:");
            }
            } catch (NumberFormatException e) {
                System.out.println("Não tente quebrar o programa! Tente de novo:");
            }
        } while (buttonEffect < 0 || buttonEffect > 1);
        switch (buttonEffect) {
            case 0 -> System.out.println("O botão está ok e feliz. (～￣▽￣)～");
            case 1 -> System.out.println("O botão está muito triste. (┬┬﹏┬┬)");
        }
        scan.close();
    }
}
