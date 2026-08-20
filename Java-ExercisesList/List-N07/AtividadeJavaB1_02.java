package ExercíciosJava_07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJavaB1_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.## bar");
        String preasure;
        double preasureConverted = 0;
        System.out.println("Insira a pressão da caldeira na medida de bar:");
        do {
            preasure = scan.nextLine();
            try {
                if (preasure.contains("bar")) {
                    preasure = preasure.replace("bar", "");
                }
                if (preasure.contains(",")) {
                    preasure = preasure.replace(",", ".");
                }
                preasureConverted = Double.parseDouble(preasure);
                if (preasureConverted >=0 && preasureConverted <10) {
                    System.out.printf("""
                            A pressão de %s da caldeira ainda não é suficiente,
                            continue a medição: %n""", df.format(preasureConverted));
                } else if (preasureConverted < 0 || preasureConverted > 60) {
                    System.out.println("""
                            A caldeira não pode estar nessa pressão,
                            tente novamente:""");
                }
            } catch (NumberFormatException e) {
                System.out.printf("""
                        A informação inserida de >%s< é inválida,
                        tente novamente: %n""", preasure);
            }
        } while (preasureConverted < 10 || preasureConverted > 60);
        System.out.printf("""
                A caldeira alcançou a pressão de %s, pressão que está dentro
                do necessário de 10 a 60 bar.""", df.format(preasureConverted));
        scan.close();
    }
}
