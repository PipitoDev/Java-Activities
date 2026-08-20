package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero;
        String divisao;
        System.out.println("digite seu numero");
        numero=scanner.nextInt();
        divisao=(numero%5==0)?"o numero e divisivel por 5": "o numero e divisivel por 5";
        System.out.println(divisao);
        scanner.close();
    }
}
