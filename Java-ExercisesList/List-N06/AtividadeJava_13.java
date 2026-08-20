package ExercíciosJava_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.#########");
        double num, numTotal=0;
        int loop=0;
        System.out.println("""
                Digite números separadamente:
                >O programa irá encerrar quando o número 0 for inserido<
                >O número zero não irá interferir nos resultados<""");
        do {
            num=scan.nextDouble();
            numTotal=numTotal+(num);
            if(num!=0){
                System.out.println("Próximo número:");
                loop=loop+1;
            }
        } while(num!=0);
        switch(loop){
            case 0 -> System.out.println("Você inseriu apenas um número e ele é o zero!");
            case 1 -> System.out.println("Você inseriu apenas dois números e um deles é zero!");
            default -> System.out.printf("""
                    Você inseriu um total de %s números;
                    A soma de todos os números inseridos é de %s;
                    A média de todos os números inseridos é de %s.""", df.format(loop), df.format(numTotal), df.format(numTotal/loop));
        }
        scan.close();
    }
}
