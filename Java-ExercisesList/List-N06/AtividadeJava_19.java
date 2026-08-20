package ExercíciosJava_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.##########");
        double num, numTotal=0;
        int verifier=0;
        System.out.println("""
                Insira números separadamente:
                >Digitar 0 irá encerrar o programa<""");
        do {
            num=scan.nextDouble();
            if(num>100){
                numTotal=numTotal+num;
                verifier=verifier+1;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
        } while(num!=0);
        switch (verifier){
            case 0 -> System.out.println("Nenhum número acima de 100 foi inserido.");
            case 1 -> System.out.printf("Apenas 1 número acima de 100 foi inserido, o número %s.", df.format(numTotal));
            default -> System.out.printf("A média de todos os números acima de 100 inseridos é: %s", df.format(numTotal/verifier));
        }
        scan.close();
    }
}
