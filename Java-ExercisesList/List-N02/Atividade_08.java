package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o número que será dividido:");
        num1=scan.nextInt();
        System.out.println("Agora, digite o divisor:");
        num2=scan.nextInt();
        if(num1!=0&&num2!=0){
            if(num1%num2==0){
                System.out.println("A divisão é exata!");
            } else {
                System.out.println("A divisão não é exata!");
            }
        } else {
            System.out.println("Não há como dividir nada com/por zero!");
        }scan.close();
    }
}
