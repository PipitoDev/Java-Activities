package ExercíciosJava_07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJavaB1_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#℃");
        String tempature;
        double temperatureConverted = 0;
        System.out.println("Insira a temperatura da extrusora:");
        do {
            tempature = scan.nextLine();
            // Utilizei apenas o símbolo direto de graus Celsius disponível no 'win + . (ponto)', útilizar outros tipos do símbolo, como ' oC ou º + C' não funcionará.
            try {
                if (tempature.contains("℃")) {
                    tempature = tempature.replace("℃", "");
                }
                if (tempature.contains(",")) {
                    tempature = tempature.replace(",", ".");
                }
                temperatureConverted = Double.parseDouble(tempature);
                if (temperatureConverted >= 0 && temperatureConverted < 180) {
                    System.out.printf("""
                            A temperatura de %s ainda é inferior ao necessário,
                            continue a medição: %n""", df.format(temperatureConverted));
                } else if (temperatureConverted < 0 || temperatureConverted > 300) {
                    System.out.println("""
                            Não há como a extrusora estar nessa temperatura,
                            tente novamente:""");
                }
            } catch (NumberFormatException e) {
                System.out.printf("""
                        A informação inserida >%s< é inválida,
                        tente novamente: %n""", tempature);
            }
        } while (temperatureConverted < 180 || temperatureConverted > 300);
        System.out.printf("A temperatura de %s da extrusora superou o necessário.", df.format(temperatureConverted));
        scan.close();
    }
}
