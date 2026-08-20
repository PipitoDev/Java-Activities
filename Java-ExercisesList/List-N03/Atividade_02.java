package ExercíciosJava_03;

import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double price, priceInfo;
        String discountInfo;
        System.out.println("""
                Insira o preço do produto:
                *Não utilize símbolos monetários*""");
        price=scan.nextDouble();
        while(price<=0){
            System.out.println("""
                    O preço inserido é inválido.
                    Tente novamente:""");
            price=scan.nextDouble();
        }
        priceInfo=price;
        price=(price<100)? price*0.90 : price;
        discountInfo=(price<100)? "É adepto ao desconto." : "Não é adepto ao desconto.";
        System.out.printf("""
                Preço inicial: R$%.2f
                %s
                Preço final: R$%.2f""", priceInfo, discountInfo, price);
        scan.close();
    }
}
