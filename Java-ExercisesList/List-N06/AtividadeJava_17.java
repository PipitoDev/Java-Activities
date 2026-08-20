package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num, numTotal=0, verifier=0;
        System.out.println("""
                Digite números separadamente:
                >Digitar 0 irá encerrar o programa<
                >O número zero não irá interferir no resultado<""");
        do {
            num=scan.nextInt();
            if(num%2==0 && num!=0){
                numTotal=numTotal+(num);
                verifier=verifier+1;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
        } while(num!=0);
        switch (verifier){
            case 0 -> System.out.println("Nenhum número par foi inserido para somar.");
            case 1 -> System.out.printf("Apenas um número par foi inserido para somar, o número %d.", numTotal);
            default -> System.out.printf("A soma de todos os números pares é: %d", numTotal);
        }
        scan.close();
    }
}
