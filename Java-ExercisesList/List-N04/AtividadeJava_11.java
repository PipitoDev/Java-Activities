package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        System.out.println("Digite um número qualquer:");
        num1=scan.nextInt();
        if(num1%2==0){
            if(num1<100){
                System.out.println(num1+ " é par e menor que 100!");
            } else {
                System.out.println(num1+ " é maior que 100!");
            }
        } else {
            if(num1>100){
                System.out.println(num1+ " é ímpar e maior que 100!");
            } else {
                System.out.println(num1+ " é menor que 100!");
            }
        }scan.close();
    }
}
