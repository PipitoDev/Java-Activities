package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB1_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String percentage;
        double perConverted = 0, perInfo = 0;
        boolean verifier = false;
        System.out.println("Informe a porcentagem do tanque de óleo:");
        do {
            percentage = scan.nextLine();
            try {
                if (percentage.contains("%")) {
                    percentage = percentage.replace("%", "");
                }
                if (percentage.contains(",")) {
                    percentage = percentage.replace(",", ".");
                }
                perConverted = Double.parseDouble(percentage);
                if (perConverted >=0 && perConverted <=100) {
                    if (perConverted >= perInfo && perConverted < 80) {
                        System.out.printf("""
                                Estado atual: %.1f%%
                                Enchendo... %n""", perConverted);
                        perInfo = perConverted;
                    } else if (perConverted >= 80) {
                        verifier = true;
                    } else {
                        System.out.printf("""
                                Não há como o tanque que estava
                                no volume de %.1f%% ficar em %.1f%%.
                                Tente novamente: %n""", perInfo, perConverted);
                    }
                } else {
                    System.out.println("""
                            Não há como o tanque de óleo estar nesse volume,
                            tente novamente:""");
                }
            } catch (NumberFormatException e) {
                System.out.printf("""
                        A informação de %s inserida é inválida.
                        Tente novamente: %n""", percentage);
            }
        } while (!verifier);
        System.out.printf("""
                Tanque de óleo com capacidade suficiente.
                Capacidade maior ou igual a 80%%: %.1f%%""", perConverted);
        scan.close();
    }
}
