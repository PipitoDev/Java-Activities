package ExercíciosJava_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.#############");
        double num, numLogCalc, numInfo, loop=0, log=5;
        System.out.println("Insira um valor menor que 1000:");
        do{
            num=scan.nextDouble();
            numInfo=num;
            numLogCalc=num;
            if(num>=1000){
                System.out.printf("%s é inválido, tente novamente com um valor menor que 1000:%n", df.format(num));
            }
        } while(num>=1000);
        do{
            num=num+(num*0.05);
            loop=loop+1;
        } while(num<1000);
        numLogCalc=1000/numLogCalc;
        numLogCalc=Math.log10(numLogCalc);
        log=(log/100)+1;
        log=Math.log10(log);
        numLogCalc=numLogCalc/log;
        System.out.printf("O número inicial %s precisou receber um aumento de 5%% %.0fx para chegar em 1000!%n", df.format(numInfo), loop);
        System.out.printf("Ou, sem arredondar muito: ~%.6sx", df.format(numLogCalc));
        scan.close();
    }
}
