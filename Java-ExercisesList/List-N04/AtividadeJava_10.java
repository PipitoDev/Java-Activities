package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int hourStart, hourEnd, hourTotal;
        System.out.println("Insira a hora de início do jogo:");
        do{
            hourStart=scan.nextInt();
            if(hourStart<0||hourStart>24){
                System.out.println("Hora inválida. Tente novamente:");
            }
        } while(hourStart<0||hourStart>24);
        System.out.println("Agora, insira a hora de fim do jogo:");
        do{
            hourEnd=scan.nextInt();
            if(hourEnd<0||hourEnd>24){
                System.out.println("Hora inválida. Tente novamente:");
            }
        } while(hourEnd<0||hourEnd>24);
        if(hourEnd<hourStart){
            hourTotal=(24-hourStart)+hourEnd;
        } else {
            hourTotal=(hourEnd-hourStart);
        }
        System.out.printf("A duração em horas totais do jogo foi: %d hora(s).", hourTotal);
        scan.close();
    }
}
