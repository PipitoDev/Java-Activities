package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num, numTotal=0, numInfo=0;
        System.out.println("""
                Insira números separadamente:
                >Digitar 0 encerrará o programa<""");
        do {
            num=scan.nextInt();
            if(num>=10 && num<=50){
                numTotal=numTotal+1;
                numInfo=num;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
        } while(num!=0);
        switch (numTotal){
            case 0 -> System.out.println("Nenhum número entre 10 e 50 foi inserido.");
            case 1 -> System.out.printf("Apenas um número entre 10 e 50 foi inserido, o número %d.", numInfo);
            default -> System.out.printf("Foi inserido um total de %d números entre 10 e 50.", numTotal);
        }
        scan.close();
    }
}
