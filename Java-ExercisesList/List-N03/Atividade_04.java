package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_04 {
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
        result=(age>=18)? "Maior de idade!":"Menor de idade!";
        System.out.println(result);
        scan.close();
    }
}
