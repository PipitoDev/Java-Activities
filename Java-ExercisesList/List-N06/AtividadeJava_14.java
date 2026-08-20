package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double nota;
        System.out.println("""
                Insira a nota:
                >Apenas de 0 a 10<""");
        do {
            nota=scan.nextDouble();
            if(nota<0 || nota>10){
                System.out.println("""
                        Nota inválida, tente novamente:
                        >Apenas notas de 0 a 10<""");
            }
        } while(nota<0 || nota>10);
        System.out.printf("A nota inserida: %.1f", nota);
        scan.close();
    }
}
