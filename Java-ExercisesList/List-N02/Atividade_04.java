package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cYear, bYear;
        System.out.println("Informe o ano atual:");
        do{
            cYear=scan.nextInt();
            if(cYear<2026){
                System.out.println("O ano atual inserido é inválido. Tente novamente:");
            }
        }while(cYear<2026);
        System.out.println("Informe o ano de nascimento:");
        do{
            bYear=scan.nextInt();
            if(bYear<1900){
                System.out.println("O ano de nascimento inserido é inválido. Tente novamente:");
            }
        }while(bYear<1900);
        if(cYear-bYear>=18){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        } scan.close();
    }
}
