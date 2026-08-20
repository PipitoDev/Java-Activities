package ExercíciosJava_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##########");
        double num, numLgc, numInfo, loop=0;
        System.out.println("Insira um número maior que 1:");
        do {
            num=scan.nextDouble();
            numInfo=num;
            numLgc=num;
            if(num<=1){
                System.out.printf("""
                        %.6s é um número inválido.
                        Tente novamente com um número maior que 1:""", df.format(num));
            }
        } while(num<=1);
        do{
            num=num/2;
            loop=loop+1;
        } while(num>1);
        numLgc=Math.log(numLgc)/Math.log(2);
        System.out.printf("O número inicial de %.6s precisa dividir %dx para ser menor ou igual a 1.%n", df.format(numInfo), (int)loop);
        if(numInfo!=2){
            System.out.printf("Ou, para uma divisão ''perfeita'', é preciso dividir por ~%.4sx", df.format(numLgc));
        }
        scan.close();
    }
}
