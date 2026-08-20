package ExercíciosJava_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##############");
        double num, numTotal=0;
        int loop=0, verifier=0;
        System.out.println("Insira 8 números separadamente:");
        do {
            loop=loop+1;
            num=scan.nextDouble();
            if(num>50){
                numTotal=numTotal+(num);
                verifier=verifier+1;
            }
            if(loop<=7){
                System.out.println("Próximo número:");
            }
        } while(loop!=8);
        switch(verifier){
            case 0-> System.out.println("Você não digitou nenhum número maior que 50 para somar.");
            case 1-> System.out.printf("Você digitou apenas um número maior que 50, o número %s.", df.format(numTotal));
            default -> System.out.printf("A soma de todos os números maiores que 50 é de: %s.", df.format(numTotal));
        }
        scan.close();
    }
}
