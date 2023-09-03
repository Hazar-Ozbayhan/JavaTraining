import java.util.Scanner;

public class UçakBiletiFiyatı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen gidilicek km'yi giriniz : ");
        int km = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz : ");
        int yas = input.nextInt();


        final double kmbasıUcret = 1.00;
        double ücret = km * kmbasıUcret;

        if (km <= 0 || yas <= 0){
            System.out.println("Hatalı değer girildi");
        } else if (yas <= 6) {
            ücret = km * kmbasıUcret / 2;
            System.out.println("Toplam ücret : "+ ücret + "TL");
        }else
            System.out.println("Toplam ücret : "+ ücret + "TL");








    }
}
