import java.util.Scanner;

public class VücutKitleİndeksiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz (cm) : ");
        double boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz (kg) : ");
        double kilo = input.nextDouble();

        boy = boy / 100;
        double indeks = kilo/(boy * boy);

        System.out.print("Vücut kitle indeksiniz : "+indeks);


    }
}
