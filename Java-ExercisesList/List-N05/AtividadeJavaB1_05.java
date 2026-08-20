package ExercíciosJava_05;

import java.util.Scanner;

public class AtividadeJavaB1_05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1, num2;
        System.out.println("Insira um número limite:");
        num1=scan.nextInt();
        num2=num1;
        while(num1>=0){
            if(num1%5==0&&num1!=0){
                System.out.println(num1);
            }
            num1=num1-1;
        }
        if(num2<=4){
            System.out.println(num2+ " é um número muito baixo para ser o limite.");
        } else {
            System.out.println("Esses são os números múltiplos 5 menores e/ou igual ao limite!");
        }scan.close();
    }
}
