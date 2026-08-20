package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1, num2;
        String result;
        System.out.println("Digite dois números separadamente:");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        result=(num1==num2)? "Os números são iguais!":"Os números não são iguais!";
        System.out.println(result);
        scan.close();
    }
}
