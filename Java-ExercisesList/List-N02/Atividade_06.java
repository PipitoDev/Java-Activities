package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite dois números separadamente:");
        num1=scan.nextInt();
        num2=scan.nextInt();
        if(num1>num2){
            System.out.println(num1+ " é maior que o " +num2);
        } else if(num2>num1){
            System.out.println(num2+ " é maior que o " +num1);
        } else {
            System.out.println(num1+ " e " +num2+ " são iguais!");
        }scan.close();
    }
}
