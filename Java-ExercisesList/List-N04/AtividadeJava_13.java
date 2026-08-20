package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1, numInfo1;
        int numVerifier;
        System.out.println("""
                Insira um número de 4 dígitos:
                Se a soma dos dois primeiros dígitos com os dois últimos, e depois
                elevado ao quadrado, for o número inicial, será um número mágico!""");
        do{
            num1=scan.nextDouble();
            numVerifier=String.valueOf((int)num1).length();
            if(numVerifier!=4){
                System.out.println("""
                        O número inserido tem mais ou menos de 4 casas.
                        Insira um número apenas com 4 casas:""");
            }
        } while(numVerifier!=4);
        numInfo1=Math.pow((num1/100)-(num1/100%1)+(num1%100), 2);
        if(num1==numInfo1){
            System.out.printf("%.0f é um número mágico!", num1);
        } else {
            System.out.printf("%.0f não é um número mágico!", num1);
        }scan.close();
    }
}
