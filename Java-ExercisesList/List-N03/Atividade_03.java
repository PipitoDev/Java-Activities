package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double degreesC;
        String result;
        System.out.println("Insira apenas os números da temperatura:");
        degreesC=scan.nextDouble();
        result=(degreesC<=0)? "Temepratura extremamente baixa!":
                (degreesC<=40)? "Temperatura dentro dos limites normais!":"Temperatura extremamente alta!";
        System.out.println(result);
        scan.close();
    }
}
