import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen vize puanınızı giriniz : ");
        int vizePoint = input.nextInt();
        System.out.print("Lütfen final puanınızı giriniz : ");
        int finalPoint = input.nextInt();

        int notOrtalaması = (int) ((vizePoint * 0.4) + (finalPoint * 0.6));

        System.out.print("Not ortalamanız : "+ notOrtalaması);


    }
}