package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero;
        String divisao;
        System.out.println("digite o ano");
        numero= scanner.nextInt();
        divisao=(numero%4==0 && numero%100!=0 || numero%400==0)?
                "esse ano e bissexto": "esse ano nao e bissexto";
        System.out.println(divisao);
        scanner.close();

    }
    }
