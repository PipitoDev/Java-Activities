package ExercíciosJava_06;

import java.util.Scanner;

public class AtividadeJava_15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String password;
        System.out.println("Insira sua senha:");
        do {
            password=scan.next();
            if(!password.equals("Joao123?")){
                System.out.println("""
                        Senha incorreta!
                        Tente novamente:""");
            }
        } while(!password.equals("Joao123?"));
        System.out.println("Acesso autorizado!");
        scan.close();
    }
}
