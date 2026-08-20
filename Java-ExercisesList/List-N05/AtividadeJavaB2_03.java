package ExercíciosJava_05;

import java.util.Scanner;

public class AtividadeJavaB2_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double nota, notaCalc=0;
        int loop=1;
        System.out.println("Informe 5 notas separadamente:");
        do{
            nota=scan.nextDouble();
            notaCalc=notaCalc+nota;
            loop=loop+1;
        } while(loop<=5);
        System.out.printf("Sua nota final é: %.1f", notaCalc/5);
    }
}
