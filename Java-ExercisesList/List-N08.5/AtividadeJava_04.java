package ExercíciosJava_08_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$0.00");
        String consumo, closeCommand = "fechar";
        double consumoC, value = 0;
        boolean verifier = false;
        System.out.println("""
                Insira o consumo de água:
                >Para finalizar o programa, escreva 'fechar'<""");
        do {
            consumo = scan.nextLine();
            try {
                if (consumo.contains(",")) {
                   consumo = consumo.replace(",", ".");
                }
                consumoC = Double.parseDouble(consumo);
                if (consumoC >= 0 && consumoC <= 15) {
                    value = 35;
                    verifier = true;
                } else if (consumoC > 15 && consumoC <= 30) {
                    value = 35 + ((consumoC - 15) * 4.5);
                    verifier = true;
                } else if (consumoC > 30){
                    value = 35 + ((consumoC - 15) * 7);
                    verifier = true;
                } else {
                    System.out.println("""
                            Não há como utilizar valores negativos.
                            Tente novamente:""");
                }
                if (verifier) {
                    System.out.printf("O valor da conta é: %s %n", df.format(value));
                    verifier = false;
                }
            } catch (NumberFormatException e) {
                if (!consumo.trim().equals(closeCommand)) {
                    System.out.printf("""
                            A informação de >%s< é inválida.
                            Tente novamente: %n""", consumo);
                }
            }
        } while (!consumo.trim().equals(closeCommand));
        System.out.println("Programa finalizado!");
        scan.close();
    }
}
