package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num;
        int numTotal=0, verifier=0;
        System.out.println("""
                Insira números separadamente:
                >O programa irá encerrar se o número 0 for digitado<""");
        do {
            num=scan.nextDouble();
            if(num>=20 && num<=80){
                numTotal=numTotal+1;
                verifier=verifier+1;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
        } while(num!=0);
        switch (verifier){
            case 0-> System.out.println("Nenhum número entre 20 e 80 foi inserido.");
            case 1-> System.out.println("Apenas 1 número entre 20 e 80 foi inserido.");
            default -> System.out.printf("Foi inserido um total de %d números entre 20 e 80.", numTotal);
        }
        scan.close();
    }
}
