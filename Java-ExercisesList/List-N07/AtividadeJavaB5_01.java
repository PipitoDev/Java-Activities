package ExercíciosJava_07;

import java.util.Scanner;

public class AtividadeJavaB5_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price;
        System.out.println("""
                Insira o preço dos lances do leilão:
                >Não útilize símbolos monetários<""");
        do {
            price = scan.nextDouble();
            if (price > 0 && price <= 50) {
                System.out.println("Preço abaixo, insira outro:");
            } else if (price <= 0) {
                System.out.println("Preço inválido, tente novamente:");
            }
        } while (price <= 50);
        System.out.printf("Vendido por R$%.2f! %n", price);
        scan.close();
    }
}
