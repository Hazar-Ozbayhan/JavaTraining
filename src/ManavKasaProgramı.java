import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double domates,elma,muz,ayva,armut,patlıcan;

        domates = 11.50;
        elma = 8.50;
        muz = 23.50;
        ayva = 15;
        armut = 20;
        patlıcan = 18.75;

        System.out.print("Kaç kilo domates : ");
        double domates_g = input.nextDouble();
        System.out.print("Kaç kilo elma : ");
        double elma_g = input.nextDouble();
        System.out.print("Kaç kilo muz : ");
        double muz_g = input.nextDouble();
        System.out.print("Kaç kilo ayva : ");
        double ayva_g = input.nextDouble();
        System.out.print("Kaç kilo armut : ");
        double armut_g = input.nextDouble();
        System.out.print("Kaç kilo patlıcan : ");
        double patlıcan_g = input.nextDouble();

        double toplamTutar = (domates_g * domates) + (elma_g * elma) + (muz_g * muz) + (ayva_g * ayva) + (armut_g * armut) + (patlıcan_g * patlıcan) ;

        System.out.print("Toplam Tutar : "+toplamTutar+" TL");

    }
}
