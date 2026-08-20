package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num, numBigger=0;
        System.out.println("""
                Insira valores:
                >Digitar 0 encerrará o programa<""");
        do {
            num=scan.nextInt();
            if(num>10){
                numBigger=numBigger+1;
            }
            if(num!=0){
                System.out.println("Próximo número:");
            }
        } while(num!=0);
        switch(numBigger){
            case 0-> System.out.println("Nenhum valor maior que 10 foi inserido.");
            case 1-> System.out.println("Apenas um número maior que 10 foi inserido.");
            default -> System.out.printf("Foi inserido %d números maiores que 10.", numBigger);
        }
        scan.close();
    }
}
