import java.text.DecimalFormat;
import java.util.Scanner;

public class energy_consumption_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dFWatss = new DecimalFormat("0.##");

        boolean answerCondition = false;
        double totalWatts = 0, totalHours = 0, wattsConversion = 0;
        int quantityConversion;
        String watts, hours, quantity, answer;

        while (!answerCondition) {
            System.out.println("Quantos watts o equipamento consome?");
            boolean wattsVerifier = false;
            do {
                watts = scan.nextLine();
                watts = watts.toLowerCase().replace("watts", "").trim();
                try {
                    wattsConversion = Double.parseDouble(watts);
                    if (wattsConversion <= 0) {
                        throw new IllegalArgumentException();
                    }
                    wattsVerifier = true;
                } catch (NumberFormatException e) {
                    System.out.println("A informação de watts inserida é inválida! \nTente novamente:");
                } catch (IllegalArgumentException e) {
                    System.out.println("Não há como ter consumido watts negativos! \nTente novamente:");
                }
            } while (!wattsVerifier);

            System.out.println("Quantos equipamentos idênticos a esse tem?");
            boolean quantityVerifier = false;
            do {
                quantity = scan.nextLine();
                try {
                    quantityConversion = Integer.parseInt(quantity);
                    if (quantityConversion <= 0) {
                        throw new IllegalArgumentException();
                    }
                    wattsConversion = wattsConversion * quantityConversion;
                    totalWatts = totalWatts + wattsConversion;
                    quantityVerifier = true;
                } catch (NumberFormatException e) {
                    System.out.println("A informação de quanttidade inserida é inválida! \nTente novamente:");
                } catch (IllegalArgumentException e) {
                    System.out.println("Não há como informar 0 equipamentos! \nTente novamente:");
                }
            } while (!quantityVerifier);

            System.out.println("""
                    Por quantas horas esse ou esses equipamentos ficam ligados?
                    > Insira essa informação em HH:MM <""");
            boolean hoursVerifier = false;
            do {
                double hoursPart, minutesPart;
                String[] hoursParts;
                hours = scan.nextLine();
                try {
                    hoursParts = hours.split(":");
                    if (hoursParts.length != 2) {
                        throw new IllegalArgumentException();
                    }
                    hoursPart = Double.parseDouble(hoursParts[0]);
                    minutesPart = Double.parseDouble(hoursParts[1]);

                    if ((hoursPart < 0 || hoursPart > 23) || (minutesPart < 0 || minutesPart > 59)) {
                        throw new IllegalArgumentException();
                    }
                    totalHours = totalHours + (hoursPart + (minutesPart / 60));
                    hoursVerifier = true;
                } catch (NumberFormatException e) {
                    System.out.println("""
                            O formato inserido é inválido! Tente novamente:
                            > Insira essa informação em HH:MM <""");
                } catch (IllegalArgumentException e) {
                    System.out.println("""
                            O formato inserido é errado! Tente novamente:
                            > Insira essa informação apenas em HH:MM <""");
                }
            } while (!hoursVerifier);

            System.out.println("Aperte Enter para adicionar outro ou ''Finalizar'' para encerrar.");
            do {
                answer = scan.nextLine();
                answer = answer.toLowerCase().trim();
                if (answer.equals("finalizar") || answer.equals("f")) {
                    answerCondition = true;
                    break;
                } else if (answer.isEmpty()) {
                    break;
                } else {
                    System.out.println("Resposta inválida! \nTente novamente:");
                }
            } while (true);
        }

        System.out.println("Resultado:");
        System.out.printf("""
                O consumo total de watts é: %s
                O tempo total ligado de tudo é: %.1f
                O consumo de kWh é de: %s
                O gasto total é(R$) : R$%.2f %n""", dFWatss.format(totalWatts), totalHours,
                dFWatss.format((totalWatts * totalHours) / 1000), ((totalWatts * totalHours) / 1000) * 1.50);
    }
}
