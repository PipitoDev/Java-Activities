package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double purchase;
        System.out.println("Insira o valor da(s) compra(s):\n" +
                "Obs: insira apenas os números.");
        do {
            purchase=scan.nextDouble();
            if(purchase<=0){
                System.out.println("Um vaLor inválido foi inserido. Tente novamente:");
            }
        }while(purchase<=0);
        if(purchase>100){
            purchase=(purchase*0.90);
            System.out.println("Elegível ao desconto: 10%");
        } else {
            System.out.println("Não é elegível ao desconto.");
        }
        System.out.printf("Valor final da compra: R$%.2f", purchase);
        scan.close();
    }
}
