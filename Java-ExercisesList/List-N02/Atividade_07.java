package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        System.out.println("Informe um número qualquer:");
        num1=scan.nextInt();
        if(num1>0){
            System.out.println(num1+ " é positivo!");
        } else if(num1<0){
            System.out.println(num1+ " é negativo!");
        } else {
            System.out.println(num1+ " é zero!");
        }scan.close();
    }
}
