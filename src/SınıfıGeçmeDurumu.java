import java.util.Scanner;

public class SınıfıGeçmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int minimumGeçmeNotu = 50;

        System.out.print("Edebiyat not ortalamınızı giriniz : ");
        int edebiyatNotu = input.nextInt();
        System.out.print("Matematik not ortalamınızı giriniz : ");
        int matematikNotu = input.nextInt();
        System.out.print("Fizik not ortalamınızı giriniz : ");
        int fizikNotu = input.nextInt();
        System.out.print("Biyoloji not ortalamınızı giriniz : ");
        int biyolojiNotu = input.nextInt();
        System.out.print("Kimya not ortalamınızı giriniz : ");
        int kimyaNotu = input.nextInt();
        System.out.print("Coğrafya not ortalamınızı giriniz : ");
        int coğrafyaNotu = input.nextInt();
        System.out.print("Tarih not ortalamınızı giriniz : ");
        int tarihNotu = input.nextInt();

        int notOrtalaması = (edebiyatNotu + matematikNotu + fizikNotu + biyolojiNotu + kimyaNotu + coğrafyaNotu + tarihNotu) / 7;

        if (notOrtalaması >= minimumGeçmeNotu){
            System.out.print("Sınıfı başarıyla geçtiniz");
        }else
            System.out.println("Sınıfta kaldınız");
    }
}
