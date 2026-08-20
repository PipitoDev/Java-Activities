package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age;
        String result;
        System.out.println("Insira sua idade:");
        age=scan.nextInt();
        result=(age>=0&&age<5)? "Idade insuficiente.":
                (age>=5&&age<=7)? "Nadador Infantil.":
                        (age>=8&&age<=17)? "Nadador Juvenil.":
                                (age>=18&&age<=80)? "Nadador Sênior.":
                                        (age>80&&age<=140)? "Nadador Pre-Histórico.":
                                                "A idade inserida é inválida.";
        System.out.println(result);
        scan.close();
    }
}
