import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilicek kilometreyi girin : ");
        double km = input.nextDouble();

        int acılısÜcreti = 19;
        double kmbasi_ücret = 13.75;

        double ücret = (double) acılısÜcreti + (km * kmbasi_ücret);

        System.out.print("Tutan ücret : "+ ücret);
    }
}
