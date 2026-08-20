package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("""
                Digite qualquer número para receber seu dobro:
                >Digitar 0 irá encerrar o programa.<""");
        do {
            num=scan.nextInt();
            if(num!=0){
                System.out.printf("O dobro de %d é %d.%n", num, num*2);
            }
        } while(num!=0);
        System.out.println("Você digitou 0, programa encerrado.");
        scan.close();
    }
}
