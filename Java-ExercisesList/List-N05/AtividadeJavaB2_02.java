package ExercíciosJava_05;

import java.util.Scanner;

public class AtividadeJavaB2_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numUser, num1=0, num2=1;
        System.out.println("Informe um número limite:");
        numUser=scan.nextInt();
        while(num2<=numUser){
            System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);
            num1=num1+1;
            num2=num2+1;
        }scan.close();
    }
}
