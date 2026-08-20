package ExercíciosJava_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade_06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age;
        String result;
        System.out.println("Insira a sua idade:");
        age=scan.nextInt();
        while(age<0||age>140){
            System.out.println("""
                    A idade inserida é inválida.
                    Tente novamente:""");
            age=scan.nextInt();
        }
        result=(age<=12)?"Infantil.":
                (age>=13&&age<=17)?"Adolecente.":
                        (age>=18&&age<=64)?"Adulto.":"Idoso.";
        System.out.println(result);
        scan.close();
    }
}
