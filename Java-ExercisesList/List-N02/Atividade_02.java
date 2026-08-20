package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double nota1, nota2, result;
        System.out.println("Informe as duas notas separadamente:");
        nota1=scan.nextDouble();
        nota2=scan.nextDouble();
        result=(nota1+nota2)/2;
        if(result>=7){
            System.out.println("Aprovado! Média de: " +result);
        } else if(result<7&&result>=0){
            System.out.println("Reprovado! Média de " +result);
        } else {
            System.out.println("Reprovado! Nota abaixo de 0.");
        }scan.close();
    }
}
