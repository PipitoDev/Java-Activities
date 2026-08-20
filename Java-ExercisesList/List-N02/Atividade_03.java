package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        System.out.println("Informe um número qualquer:");
        num1=scan.nextInt();
        if(num1%5==0&&num1!=0){
            System.out.println(num1+ " é divisível por 5!");
        } else if(num1%5!=0){
            System.out.println(num1+ " não é divisível por 5!");
        } else if(num1==0){
            System.out.println("Não há como dividir o 0!");
        }scan.close();
    }
}
