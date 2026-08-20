package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        String result1;
        System.out.println("Insira um número qualquer:");
        num1=scan.nextInt();
        if(num1!=0){
            result1=(num1%7==0)? num1+ " é um número múltiplo de 7!": num1+ " não é um número múltiplo de 7!";
            System.out.println(result1);
            result1=(num1%11==0)? num1+ " é um número múltiplo de 11!": num1+ " não é um número múltiplo de 11!";
            System.out.println(result1);
        } else {
            System.out.println("Você digitou zero! (˘︹˘)");
        }scan.close();
    }
}
