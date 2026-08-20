package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        System.out.println("Digite um número qualquer:");
        num1=scan.nextInt();
        if(num1%2==0){
            System.out.println(num1+ " é um número par!");
        } else if(num1%2!=0) {
            System.out.println(num1+ " é um número ímpar!");
        }scan.close();
    }
}
