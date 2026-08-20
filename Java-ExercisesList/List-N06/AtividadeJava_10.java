package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num, numEvenTotal=0, numOddTotal=0, verifierEven=0, verifierOdd=0;
        System.out.println("""
                Insira números para somar:
                >O programa encerrará quando o número 0 for inserido<
                >O programa não considera o número 0 como valido para somar<""");
        do {
            num=scan.nextInt();
            if(num%2==0 && num!=0){
                numEvenTotal=numEvenTotal+num;
                verifierEven=verifierEven+1;
            } else if(num%2!=0) {
                numOddTotal=numOddTotal+num;
                verifierOdd=verifierOdd+1;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
        } while(num!=0);
        if(verifierEven!=0 || verifierOdd!=0){
            switch(verifierEven) {
                case 0 -> System.out.println("Nenhum número par foi inserido para somar.");
                case 1 -> System.out.printf("Apenas um número par foi inserido para somar, o número %d.%n", numEvenTotal);
                default -> System.out.printf("A sona de todos os números pares é: %d%n", numEvenTotal);
            }
            switch(verifierOdd) {
                case 0 -> System.out.println("Nenhum número ímpar foi inserido para somar.");
                case 1 -> System.out.printf("Apenas um número ímpar foi inserido para somar, o número %d.%n", numOddTotal);
                default -> System.out.printf("A soma de todos os números ímpares é: %d%n", numOddTotal);
            }
        } else {
            System.out.println("Você digitou 0 como primeiro número, programa encerrado sem somar nenhum valor.");
        }
        scan.close();
    }
}
