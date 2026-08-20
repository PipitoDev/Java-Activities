package ExercíciosJava_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.#############");
        double num, numTotal=0, numDivider=0, numVerifier=0;
        System.out.println("""
                Insira números:
                >O programa encerrará quando um número negativo for digitado.<""");
        do {
            num=scan.nextDouble();
            if(num>0){
                numTotal=numTotal+(num);
                numDivider=numDivider+1;
                numVerifier=numVerifier+1;
            }
            if(num>=0){
                System.out.println("Próximo número:");
            }
        } while(num>=0);
        if(numVerifier==0){
            System.out.println("Nenhum número pasitivo foi digitado.");
        } else if(numVerifier==1){
            System.out.printf("Apenas um número positivo foi digitado, o número %s.", df.format(numTotal));
        } else {
            System.out.printf("A média de todos os números positivos digitados é: %s.", df.format(numTotal/numDivider));
        }
        scan.close();
    }
}
