import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ürünün fiyatını giriniz : ");
        double ürünFiyatı = input.nextDouble();

        double yeniFiyatı = ürünFiyatı + (ürünFiyatı * 0.18);

        System.out.println("Ürünün KDV'li fiyatı : "+ yeniFiyatı);
    }
}
