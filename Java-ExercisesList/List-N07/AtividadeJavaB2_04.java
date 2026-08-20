package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB2_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senaiID;
        boolean verifier = false;
        System.out.println("""
                Insira seu crachá do Senai:
                Modelo referência:
                SENAI-xxxx-xxxx""");
        do {
            senaiID = scan.nextLine();
            if (senaiID.trim().matches("SENAI-\\d{4}-\\d{4}")) {
                verifier = true;
            } else {
                System.out.println("""
                        O crachá inserido é inválido!
                        Tente novamente:""");
            }
        } while (!verifier);
        System.out.println("Crachá verificado e confirmado com sucesso!");
        scan.close();
    }
}
