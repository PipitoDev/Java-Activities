package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1, num2, num3;
        String result;
        System.out.println("""
                Escreva três números separadamente
                ou insira um após o outro:
                *ex: 1 2 3""");
        num1=scan.nextInt(); num2=scan.nextInt(); num3=scan.nextInt();
        result=(num1==num2&&num1==num3)? "Todos números são iguais!":
                (num1>=num2&&num1>=num3)? num1+ " é o maior número!":
                (num2>num1&&num2>num3)? num2+ " é o maior número!":
                        num3+ " é o maior número!";
        System.out.println(result);
        scan.close();
    }
}
