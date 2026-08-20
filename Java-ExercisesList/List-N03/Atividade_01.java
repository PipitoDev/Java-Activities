package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double payment;
        String result;
        System.out.println("""
                Insira o salário do funciorário:
                *Não utilize símbolos monetários*""");
        payment=scan.nextDouble();
        while(payment<0){
            System.out.println("Um valor inválido foi inserido, tente novamente:");
            payment=scan.nextDouble();
        }
        result=(payment>2000.00)? "alto":"baixo";
        System.out.printf("O salário de R$%.2f é %s.", payment, result);
        scan.close();
    }
}
