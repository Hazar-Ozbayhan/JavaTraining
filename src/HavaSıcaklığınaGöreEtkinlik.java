import java.util.Scanner;

public class HavaSıcaklığınaGöreEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz :");
        int havaDerecesi = input.nextInt();

        if (havaDerecesi <= 5){
            System.out.println("Ev partisi yapınız");
        } else if (havaDerecesi > 5 && havaDerecesi <= 15) {
            System.out.println("Sinemaya gidiniz");
        } else if (havaDerecesi > 15 && havaDerecesi <= 25) {
            System.out.println("Konsere gidiniz");
        } else if (havaDerecesi > 25 && havaDerecesi <= 35) {
            System.out.println("Denize gidiniz");
        }else
            System.out.println("Evden çıkmayın ");
    }
}
