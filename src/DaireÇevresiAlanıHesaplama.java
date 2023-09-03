import java.util.Scanner;

public class DaireÇevresiAlanıHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen dairenin çapını giriniz :");
        double R = input.nextDouble();

        double r = R /2;

        double çevre = 2 * r * 3.14;
        double alan = 3.14 * r * r;

        System.out.println("Dairenin çevresi : "+ çevre);
        System.out.print("Dairenin alanı : "+ alan);
    }
}
