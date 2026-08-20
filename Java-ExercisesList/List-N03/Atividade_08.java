package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1, counter=0;
        String result;
        Character loop;
        System.out.println("Escreva um número qualquer:");
        do{
            num1=scan.nextInt();
            result=(num1>=0)? num1+ " é positivo!":num1+ " é negativo!";
            System.out.println(result);
            counter=counter+1;
            System.out.println("Continuar ? S/N");
            do{
                loop=scan.next().charAt(0);
                if(loop.equals('S')||loop.equals('N')){
                    if(loop.equals('S')){
                        System.out.println("Digite outro número:");
                    } else if(loop.equals('N')){
                        System.out.printf("""
                                Programa encerrado.
                                %d uso(s),""", counter);
                    }
                } else{
                    System.out.println("""
                            Resposta inválida, tente novamente:
                            use apenas 'S' ou 'N'.""");
                }
            } while(!loop.equals('S')&&!loop.equals('N'));
        } while(!loop.equals('N'));
        scan.close();
    }
}
