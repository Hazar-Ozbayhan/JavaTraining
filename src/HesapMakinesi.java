import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("İşlemi Seçiniz ");
        System.out.println("Toplama için 1'e basınız ");
        System.out.println("Çıkarma için 2'e basınız ");
        System.out.println("Çarpma için 3'e basınız ");
        System.out.println("Bölme için 4'e basınız ");
        System.out.print("Seçiniz : ");
        int select = input.nextInt();

        System.out.print("İlk sayıyı giriniz : ");
        int numara1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int numara2 = input.nextInt();

        if (select == 1){
            System.out.println("Toplama sonucu "+ (numara1 + numara2));
        } else if (select == 2) {
            System.out.println("Çıkarma sonucu "+ (numara1 - numara2));
        } else if (select == 3) {
            System.out.println("Çarpma sonucu "+ (numara1 * numara2));
        } else if (select == 4) {
            System.out.println("Bölme sonucu "+ (numara1 / numara2));
        }

    }
}
