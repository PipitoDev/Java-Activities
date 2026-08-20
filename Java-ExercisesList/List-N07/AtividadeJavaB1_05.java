package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB1_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String humidity;
        int humidConverted = 0;
        boolean confirmation = false;
        System.out.println("Insira a umidade local:");
        do {
            humidity = scan.nextLine();
            try {
                if (humidity.contains("%")) {
                    humidity = humidity.replace("%", "");
                }
                humidConverted = Integer.parseInt(humidity);
                if (humidConverted >= 0 && humidConverted <= 100) {
                    confirmation = true;
                } else {
                    System.out.printf("""
                            A umidade inserida de %d%% é impossível, o valor só pode ser de 0 a 100%%.
                            Tente novamente: %n""", humidConverted);
                }
            } catch (NumberFormatException e) {
                System.out.println("""
                        A informação inserida não é válida e não pode ser lida.
                        Tente novamente:""");
            }
        } while (!confirmation);
        if (humidConverted >= 40 && humidConverted <= 60) {
            System.out.printf("A umidade de %d%% é válida.", humidConverted);
        } else {
            System.out.printf("A umidade de %d%% é inválida.", humidConverted);
        }
        scan.close();
    }
}
