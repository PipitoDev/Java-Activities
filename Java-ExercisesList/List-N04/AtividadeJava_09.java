package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char letra;
        String result;
        System.out.println("Digite qualquer letra:");
        do{
            letra=scan.next().charAt(0);
            if(!Character.isLetter(letra)){
                System.out.println("""
                        É para inserir uma letra!!!
                        Tente de novo:""");
            }
        } while(!Character.isLetter(letra));
        result=(letra=='a'||letra=='A'||letra=='e'||letra=='E'||letra=='i'||letra=='I'||
                letra=='o'||letra=='O'||letra=='u'||letra=='U')? letra+ " é uma vogal!": letra+ " é uma consoante!";
        System.out.println(result);
        scan.close();
    }
}
