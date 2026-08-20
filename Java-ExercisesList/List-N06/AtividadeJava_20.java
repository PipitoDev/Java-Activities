package ExercíciosJava_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtividadeJava_20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("R$0.00");
        String price;
        double priceTotal=0, priceConvert;
        System.out.println("""
                Insira os valores dos produtos:
                >Digitar ''fechar'' irá encerrar o programa
                e mostrar o resultado<""");
        do {
            price=scan.nextLine();
            try {
                if(price.startsWith("R$")){
                    price=price.replace("R", "").replace("$", "");
                }
                priceConvert=Double.parseDouble(price);
                priceTotal=priceTotal+(priceConvert);
                System.out.println("""
                        Próximo valor:
                        >Ou ''fechar'' para finalizar<""");
            } catch (NumberFormatException e){
                if(!price.equals("fechar")){
                    System.out.println("""
                            Uma informação inválida foi inserida,
                            tente novamente:
                            >Para valores, use apenas números ou R$ no início<
                            >Para finalizar, use ''fechar'' <""");
                }
            }
        } while(!price.equals("fechar"));
        System.out.printf("Valor total: %s%n", df.format(priceTotal));
        if(priceTotal>500){
            System.out.println("Desconto disponível: 10%");
            priceTotal=priceTotal*0.90;
        } else {
            System.out.println("Desconto não disponível.");
        }
        System.out.printf("Valor final: %s", df.format(priceTotal));
        scan.close();
    }
}
