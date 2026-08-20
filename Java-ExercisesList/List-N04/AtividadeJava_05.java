package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        String result;
        System.out.println("Informe o número do intervalo:");
        do{
            num=scan.nextInt();
            if(num<0){
                System.out.println("""
                        Um valor inválido foi inserido.
                        Tente novamente:""");
            }
        } while(num<0);
        result=(num>=100&&num<=200)? "Está dentro do intervalo numérico!":
                (num<100)? "Está fora do intervalo numérico e é menor!":
                        "Está fora do intervalo numérico e é maior!";
        System.out.println(result);
        scan.close();
    }
}
