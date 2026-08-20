package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double payment;
        String result;
        System.out.println("Insira o salário:");
        do{
            payment=scan.nextDouble();
            if(payment<0){
                System.out.println("""
                        Não há como receber um salário negativo.
                        Tente novamente:""");
            }
        } while(payment<=0);
        result=(payment<=2000)? "O salário de R$%.2f é isento de imposto.":
                (payment<=5000)? """
                        O salário de R$%.2f tem que pagar 10%% de imposto.
                        O salário final fica em R$%.2f""": """
                        O salário de R$%.2f tem que pagar 20%% de imposto.
                        O salário final fica em R$%.2f""";
        if(payment<=5000){
            System.out.printf(result, payment, payment*0.90);
        } else {
            System.out.printf(result, payment, payment*0.80);
        }scan.close();
    }
}
