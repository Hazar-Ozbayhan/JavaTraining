import java.util.Scanner;

public class HipotenüsHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz : ");
        double a = input.nextDouble();
        System.out.print("Üçgenin ikinci kenarını giriniz : ");
        double b = input.nextDouble();

        double a_üssü = Math.pow(a,2);
        double b_üssü = Math.pow(b,2);

        double h_üssü = a_üssü + b_üssü;

        double h = Math.sqrt(h_üssü);

        System.out.print("Hipotenüsün değeri : "+ h);

    }
}
