package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num, numVerifier=0, numTotal=0;
        System.out.println("""
                Insira números:
                >O programa encerrará se o número 0 for digitado.<""");
        do {
            num=scan.nextInt();
            if(num%3==0){
                numTotal=numTotal+(num);
                numVerifier=numVerifier+1;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
        } while(num!=0);
        if(numVerifier==0){
            System.out.println("Nenhum número múltiplo de 3 foi inserido.");
        } else if(numVerifier==1){
            System.out.printf("Apenas um número múltiplo de 3 foi inserido, o número %d.", numTotal);
        } else {
            System.out.printf("A soma de todos os números múltiplos de 3 inseridos é: %d.", numTotal);
        }
        scan.close();
    }
}
