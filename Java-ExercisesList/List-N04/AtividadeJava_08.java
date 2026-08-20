package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double weight, height, iMC;
        String result;
        System.out.println("Insira o seu peso em quilos(kg):");
        do{
            weight=scan.nextDouble();
            if(weight<=0){
                System.out.println("""
                        Você inseriu um peso inválido.
                        Tente novamente:""");
            }
        } while(weight<=0);
        System.out.println("Insira a sua altura em metros(m):");
        do{
            height=scan.nextDouble();
            if(height<=0||height>3){
                System.out.println("""
                        Você inseriu uma altura inválida.
                        Tente novamente:""");
            }
        } while(height<=0||height>3);
        iMC=weight/(height*height);
        //Utilizei uma tabela geral para adultos, provavelmente é bizonha.
        result=(iMC<18.5)? "Você está abaixo do peso.":
        (iMC>18.5&&iMC<25)? "Você está no peso ideal.": "Você está acima do peso.";
        System.out.printf("""
                Seu IMC é de: %.1f
                %s""", iMC, result);
        scan.close();
    }
}
