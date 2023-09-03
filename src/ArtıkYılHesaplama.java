import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yılı giriniz : ");
        int yıl = input.nextInt();

        if (yıl % 4 == 0 && yıl % 100 != 0 || yıl % 400 == 0){
            System.out.println(yıl+ " Artık yıldır");
        }
        else
            System.out.println(yıl+ " Artık yıl değildir");
    }
}
