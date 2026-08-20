package ExercíciosJava_04;

import java.util.Scanner;

public class AtividadeJava_12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double productPrice, productInfo;
        char code;
        System.out.println("Insira o valor do produto:");
        do{
            productPrice=scan.nextDouble();
            if(productPrice<=0){
                System.out.println("""
                        Um valor inválido foi inserido.
                        Tente novamente:""");
            }
        } while(productPrice<=0);
        System.out.println("""
                Agora, insira o código do meio de pagamento:
                1 : Pagamento a vista(10% off)
                2 : Pagamento no cartão(5% off)
                3 : Parcelado em 2x(sem desconto)""");
        do{
            code=scan.next().charAt(0);
            if(code!='1'&&code!='2'&&code!='3'){
                System.out.println("""
                Um código diferente foi inserido.
                Tente novamente:
                1 : Pagamento a vista(10% off)
                2 : Pagamento no cartão(5% off)
                3 : Parcelado em 2x(sem desconto)""");
            }
        } while(code!='1'&&code!='2'&&code!='3');
        if(code=='1'){
            productInfo=productPrice*0.1;
        } else if(code=='2'){
            productInfo=productPrice*0.05;
        } else {
            productInfo=productPrice/2;
        }
        if(code!='3'){
            System.out.printf("""
                    O preço total do produto é: R$%.2f
                    O desconto aplicado é: R$%.2f
                    O preço final é: R$%.2f""", productPrice, productInfo, productPrice-productInfo);
        } else {
            System.out.printf("""
                    O preço total do produto é: R$%.2f
                    Pagamento parcelado em: 2x
                    O preço das parcelas é: R$%.2f""", productPrice, productInfo);
        }scan.close();
    }
}
