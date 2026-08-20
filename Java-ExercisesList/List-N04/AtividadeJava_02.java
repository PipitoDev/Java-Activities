package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sideA, sideB, sideC;
        String result;
        System.out.println("Insira separadamente os valores de cada lado:");
        sideA=scan.nextDouble(); sideB=scan.nextDouble(); sideC=scan.nextDouble();
        result=(sideA+sideB>sideC&&sideA+sideC>sideB&&sideB+sideC>sideA)?
                "Os valores informados podem formar um triângulo!":
                "Os valores informados NÃO podem formar um triângulo!";
        System.out.println(result);
        scan.close();
    }
}
