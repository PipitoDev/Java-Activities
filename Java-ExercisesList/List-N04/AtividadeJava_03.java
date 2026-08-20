package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sideA, sideB, sideC;
        int result2;
        String result1;
        System.out.println("Insira separadamente os valores de cada lado:");
        sideA=scan.nextDouble();
        sideB=scan.nextDouble();
        sideC=scan.nextDouble();
        result2=(sideA+sideB>sideC&&sideA+sideC>sideB&&sideB+sideC>sideA)? 1 : 0;
        if(result2==0){
            System.out.println("Não é possível formar um triângulo com esses valores!");
        } else {
            result1=(sideA==sideB&&sideA==sideC)? "O triângulo é equilátero!":
                    (sideA==sideB&&sideA!=sideC||sideA==sideC&&sideA!=sideB||
                            sideB==sideC&&sideB!=sideA)? "O triângulo é isósceles!":
                            "O triângulo é escaleno!";
            System.out.println(result1);
        }scan.close();
    }
}
