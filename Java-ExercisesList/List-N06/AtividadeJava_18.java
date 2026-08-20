package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num, numSmaller=0, numBigger=0, counter=0;
        System.out.println("Insira 10 números quaisquer:");
        do {
            counter=counter+1;
            num=scan.nextInt();
            if(num<20){
                numSmaller=numSmaller+1;
            } else if(num>50){
                numBigger=numBigger+1;
            }
            if(counter<=9){
                System.out.println("Próximo número:");
            }
        } while(counter<10);
        switch (numSmaller){
            case 0 -> System.out.println("Nenhum número menor que 20 foi inserido.");
            case 1 -> System.out.println("Apenas 1 número menor que 20 foi inserido.");
            case 10 -> System.out.println("Todos os números inseridos foram menores que 20.");
            default -> System.out.printf("Foi inserido um total de %d números menores que 20.%n", numSmaller);
        }
        switch (numBigger){
            case 0 -> System.out.println("Nenhum número maior que 50 foi inserido.");
            case 1 -> System.out.println("Apenas 1 número maior que 50 foi inserido.");
            case 10 -> System.out.println("Todos os números inseridos foram maiores que 50.");
            default -> System.out.printf("Foi inserido um total de %d números maiores que 50.%n", numBigger);
        }
        scan.close();
    }
}
