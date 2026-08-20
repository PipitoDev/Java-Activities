package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numLimit, numSum, numTotal=0;
        System.out.println("Insira um número limite:");
        numLimit=scan.nextInt();
        System.out.println("Agora, insira um número ou vários até o valor total ser maior que o limite:");
        do {
            numSum=scan.nextInt();
            numTotal=numTotal+numSum;
            if(numTotal<numLimit){
                System.out.printf("""
                    Valor limite: %d
                    Valor total acumulado: %d
                    Próximo valor:""", numLimit, numTotal);
            }
        } while(numTotal<numLimit);
        System.out.printf("O valor total foi %d, que é maior que %d.", numTotal, numLimit);
        scan.close();
    }
}
