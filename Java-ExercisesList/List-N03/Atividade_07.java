package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1, num2, num3;
        String numEqual;
        System.out.println("Insira três números separadamente:");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        num3=scan.nextDouble();
        numEqual=(num1==num2&&num1==num3&&num2==num3)? "Todos os números são iguais!":
                (num1>=num2&&num1>=num3)? num1+ " é o maior número!":
                (num2>=num1&&num2>=num3)? num2+ " é o maior número!": num3+ " é o maior número!";
        System.out.println(numEqual);
        scan.close();
    }
}
