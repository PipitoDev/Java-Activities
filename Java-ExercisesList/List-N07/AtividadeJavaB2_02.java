package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB2_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password, passwordSystem, passwordVerifier;
        String loopQ1, loopQ2;
        boolean confirmation1 = false, confirmation2 = false, verifier1 = false;
        System.out.println("Crie sua senha:");
        do {
            if (verifier1) {
                System.out.println("Recrie sua senha:");
            }
            do {
                password = scan.nextLine();
                passwordSystem = password;
                if (passwordSystem.length() < 5) {
                    System.out.println("Senha inválida, precisa conter pelo menos 5 caracteres. Tente novamente:");
                }
            } while (passwordSystem.length() < 5);
            System.out.println("Confirme sua senha:");
            do {
                passwordVerifier = scan.nextLine();
                if (!passwordVerifier.equals(passwordSystem)) {
                    System.out.println("As senhas não se conferem, tente novamente:");
                } else {
                    confirmation2 = true;
                }
            } while (!confirmation2);
            System.out.println("Sua senha foi salva, deseja vê-la? S/N");
            do {
                loopQ1 = scan.nextLine();
                loopQ1 = loopQ1.toLowerCase();
                if (!loopQ1.equals("s") && !loopQ1.equals("n")) {
                    System.out.println("Você inseriu uma informação inválida, tente novamente com S ou N:");
                } else if (loopQ1.equals("s")) {
                    System.out.printf("Sua senha é: %s %n", passwordSystem);
                }
            } while (!loopQ1.equals("s") && !loopQ1.equals("n"));
            System.out.println("Deseja manter essa senha? S/N");
            do {
                loopQ2 = scan.nextLine();
                loopQ2 = loopQ2.toLowerCase();
                if (!loopQ2.equals("s") && !loopQ2.equals("n")) {
                    System.out.println("Você inseriu uma informação inválida, tente novamente com S ou N:");
                } else {
                    if (loopQ2.equals("s")) {
                        confirmation1 = true;
                    } else {
                        verifier1 = true;
                    }
                }
            } while (!loopQ2.equals("s") && !loopQ2.equals("n"));
        } while (!confirmation1);
        System.out.println("Agora, insira sua senha:");
        do {
            password = scan.nextLine();
            if (!password.equals(passwordSystem)) {
                System.out.println("A senha inserida é inválida. Tente novamente:");
            }
        } while (!password.equals(passwordSystem));
        System.out.println("Acesso autorizado!");
        scan.close();
    }
}
