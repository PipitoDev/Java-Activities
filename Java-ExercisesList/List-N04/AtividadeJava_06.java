package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1, num2, calcResult;
        char operator;
        String result;
        System.out.println("Insira o primeiro número:");
        num1=scan.nextDouble();
        System.out.println("Insira o segundo número:");
        num2=scan.nextDouble();
        System.out.println("""
                Insira o operador para o cálculo:
                +, -, x ou /""");
        do{
            operator=scan.next().charAt(0);
            if(operator!='+'&&operator!='-'&&operator!='x'&&operator!='/'){
                System.out.println("""
                        Um operador inválido foi inserido.
                        Por favor, tente novamente apenas com:
                                  +, -, x ou /""");
            }
        } while(operator!='+'&&operator!='-'&&operator!='x'&&operator!='/');
        result=(operator=='+')? num1+ " + " +num2+ " = " +(calcResult=num1+num2):
                (operator=='-')? num1+ " - " +num2+ " = " +(calcResult=num1-num2):
                (operator=='x')? num1+ " x " +num2+ " = " +(calcResult=num1*num2): num1+ " / " +num2+ " = " +(calcResult=num1/num2);
        System.out.printf("O resultado da sua operação é: %s%n", result);
        if(operator=='/'){
            System.out.printf("O resultado sem casa decimal é: %.0f%n", calcResult);
            System.out.println("O restante da divisão é : "+num1%num2);
        } else {
            System.out.printf("O resultado sem casa decimal é: %.0f", calcResult);
        }scan.close();
    }
}
