package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num, numTotal=0, verifier=0;
        System.out.println("""
                Insira números conforme desejar:
                >Digitar 0 encerrará o programa<""");
        do {
            num=scan.nextInt();
            if(num%5==0 && num!=0){
                numTotal=numTotal+1;
                verifier=verifier+1;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
        } while(num!=0);
        switch(verifier){
            case 0-> System.out.println("Você não digitou nenhum número múltiplo de 5!");
            case 1-> System.out.println("Você digitou apenas 1 número múltiplo de 5!");
            default -> System.out.printf("Você digitou %d números múltiplos de 5!", numTotal);
        }
        scan.close();
    }
}
