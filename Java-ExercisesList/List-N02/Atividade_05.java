package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        System.out.println("Digite um número qualquer:");
        num1=scan.nextInt();
        if(num1%2==0&&num1%3==0&&num1!=0){
            System.out.println(num1+ " é divisível por 2 e 3 ao mesmo tempo!");
        } else if(num1!=0){
            System.out.println(num1+ " não é divisível por 2 e 3 ao mesmo tempo!");
        } else {
            System.out.println("Não há como dividir o 0!");
        }scan.close();
    }
}
