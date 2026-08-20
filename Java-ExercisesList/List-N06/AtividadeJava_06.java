package ExercíciosJava_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##############");
        double num, numBigger=0, numSmaller=0, numVerifier=0;
        System.out.println("""
                Digite números:
                >Digitar 0 encerrará o programa.<""");
        do {
            num=scan.nextDouble();
            if(numVerifier==0){
                numBigger=num;
                numSmaller=num;
            }
            if(num>numBigger){
                numBigger=num;
            } else if(num<numSmaller && num!=0){
                numSmaller=num;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
            numVerifier=numVerifier+1;
        } while(num!=0);
        if(numVerifier==1){
            System.out.println("Você só digitou um número e ele é o zero!");
        } else if(numVerifier==2){
            System.out.printf("Você inseriu apenas um número diferente de zero, o número %s.", df.format(numBigger));
        } else {
            System.out.printf("""
                    O maior número inserido é: %s
                    O menor número inserido é: %s""", df.format(numBigger), df.format(numSmaller));
        }
        scan.close();
    }
}
