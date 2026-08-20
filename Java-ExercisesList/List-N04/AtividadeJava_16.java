package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        String result;
        System.out.println("Digite qualquer número:");
        num1=scan.nextInt();
        result=(num1%2==0&&num1%3==0&&num1%5==0)? num1+ " é divisível por 2, 3 e 5 ao mesmo tempo!":
                num1+ " não é divisível por 2, 3 e 5 ao mesmo tempo!";
        System.out.println(result);
        scan.close();
    }
}
