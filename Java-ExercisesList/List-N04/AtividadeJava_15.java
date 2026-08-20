package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int day, month;
        System.out.println("Insira o dia em que nasceu:");
        do{
            day=scan.nextInt();
            if(day<1||day>31){
                System.out.println("Dia inválido, tente novamente:");
            }
        } while(day<1||day>31);
        System.out.println("Insira o mês em que nasceu:");
        do{
            month=scan.nextInt();
            if(month<1||month>12){
                System.out.println("Mês inválido, tente novamente:");
            }
        } while(month<1||month>12);
        if(month==3||month==4){
            if(day>=21&&month==3||day<=19&&month==4){
                System.out.println("Você é de Áries!");
            } else {
                System.out.println("Você não é de Áries!");
            }
        } else {
            System.out.println("Você não é de Áries!");
        }scan.close();
        //Não tive tempo e tive preguiça de fixar os dias dos meses, kkkk.
    }
}
