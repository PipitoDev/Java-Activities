package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_09 {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        double frio ;
        String temperatura;
        System.out.println("digite a temperatura");
        frio=scanner.nextDouble();
        temperatura=(frio<=14)?"a temperatura esta fria":
                (frio>=15&& frio<=24)?"a temperatura esta agradavel":
                        (frio>=25&& frio<=40)?"a temperatura esta quente": "!!a temperatura esta acima do recomendado!!";
        System.out.println(temperatura);
        scanner.close();



    }
}
