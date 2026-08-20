package ExercíciosJava_02;

import java.util.Scanner;

public class Atividade_10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int password, passwordInfo;
        passwordInfo=1234; //Também dá para ignorar essa variável e utlizar o "1234" dentro do If.
        System.out.println("Insira a senha do usuário:");
        password=scan.nextInt();
        if(password==passwordInfo){
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado!");
        }scan.close();
    }
}
