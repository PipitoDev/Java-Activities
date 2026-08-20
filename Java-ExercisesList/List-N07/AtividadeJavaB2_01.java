package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB2_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password, user, passwordSys = "?", userSys = "?";
        boolean userCreationV = false, passWCreationV = false, logInVerifer = false;
        System.out.println("""
                \nCriação de usuário.
                Insira o nome do usuário:""");
        do {
            user = scan.nextLine();
            if (user.contains(" ") || user.length() < 4) {
                System.out.println("""
                        Um nome de usuário não pode conter espaço e/ou menos de 4 caracteres.
                        Tente novamente:""");
            } else {
                userSys = user;
                userCreationV = true;
            }
        } while (!userCreationV);
        System.out.println("Insira qual será a senha:");
        do {
            password = scan.nextLine();
            if (password.contains(" ") || password.length() < 5) {
                System.out.println("""
                        A senha não pode conter espaços e/ou menos de 5 digitos.
                        Tente novamente:""");
            } else {
                passwordSys = password;
                passWCreationV = true;
            }
        } while (!passWCreationV);
        System.out.println("Confirme sua senha:");
        passWCreationV = false;
        do {
            password = scan.nextLine();
            if (!password.equals(passwordSys)) {
                System.out.println("As senhas não se conferem, tente novamente:");
            } else {
                passWCreationV = true;
            }
        } while (!passWCreationV);
        System.out.println("""
                Úsuario criado com sucesso!
                Para logar, insira os dados da conta;
                """);
        do {
            System.out.println("Usuário:");
            user = scan.nextLine();
            System.out.println("Senha");
            password = scan.nextLine();
            if (!user.equals(userSys) || !password.equals(passwordSys)) {
                if (!user.equals(userSys)) {
                    System.out.println("Nome de usuário incorreto.");
                }
                if (!password.equals(passwordSys)) {
                    System.out.println("Senha incorreta.");
                }
                System.out.println("Tente novamente:\n");
            } else {
                logInVerifer = true;
            }
        } while (!logInVerifer);
        System.out.println("Acesso confirmado.");
        scan.close();
    }
}
