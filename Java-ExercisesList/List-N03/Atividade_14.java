package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double nota;
        String result;
        System.out.println("""
                Insira a nota do aluno:
                *min. 0, máx. 10*""");
        do{
            nota=scan.nextDouble();
            result=(nota>=0&&nota<7)? "Reprovado!":
                    (nota>=7&&nota<=10)? "Aprovado!": """
                        Uma nota inválida foi inserida.
                        Tente novamente:""";
            if(nota<0||nota>10){
                System.out.println(result);
            }
        } while(nota<0||nota>10);
        System.out.println(result);
        scan.close();
    }
}
