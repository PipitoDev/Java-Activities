package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        String calculo;
        System.out.println("digite os lados");
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();
        calculo=(a+b>c && b+c>a && a+c>b)? "os lados formam um triangulo" : "os lados nao formam um triangulo";
        System.out.println(calculo);
        scanner.close();

    }
}
