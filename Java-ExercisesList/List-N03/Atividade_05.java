package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age;
        String result;
        System.out.println("Insira a sua idade:");
        age=scan.nextInt();
        while(age<0||age>120){
            System.out.printf("""
                    A idade de %d é inválida.
                    Tente novamente:""", age);
            age=scan.nextInt();
        }
        result=(age>=16)? "Pode votar.":"Nâo pode votar.";
        System.out.println(result);
        scan.close();
    }
}
