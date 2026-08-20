package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1, num2, num3;
        String result;
        int separator=0;
        System.out.println("Digite três números separadamente:");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        num3=scan.nextDouble();
        result=(num1>=num2&&num1>=num3)? num1+ " é o maior número!":
                (num2>=num1&&num2>=num3)? num2+ " é o maior número!":
                        num3+ " é o maior número!";
        if(num1==num2&&num1==num3&&num2==num3){
            result="Todos os números são iguais!";
            separator=1;
        }
        System.out.println(result);
        result=(num1<=num2&&num1<=num3)? num1+ " é o menor número!":
                (num2<=num1&&num2<=num3)? num2+ " é o menor número!":
                        num3+ " é o menor número!";
        if(separator==0){
            System.out.println(result);
        }
        scan.close();
    }
}