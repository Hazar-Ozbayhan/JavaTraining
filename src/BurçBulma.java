import java.util.Scanner;

public class BurçBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* (oğlak22aralık-21ocak)-(kova22ocak-19şubat)-(balık20şubat-20mart)-(koç21mart-20nisan)-(boğa21nisan-21mayıs)-(ikizler22mayıs-22haziran)
         (yengeç23haziran-22temmuz)(aslan23temmuz-22ağustos)(başak23ağustos-22eylül)(terazi23eylül-22ekim)(akrep23ekim-21kasım)(yay22kasım-21aralık)*/

        System.out.print("Lütfen ay giriniz: ");
        int month = input.nextInt();
        System.out.print("Lütfen gün giriniz: ");
        int day = input.nextInt();

        boolean hata = true;

        switch (month){
            case 1:
                if (day >=1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Oğlak burcu");
                    } else {
                        System.out.println("Kova burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 2:
                if (day >=1 && day <= 28){
                    if (day <= 19){
                        System.out.println("Kova burcu");
                    }else{
                        System.out.println("Balık burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 3:
                if (day >=1 && day <= 31){
                    if (day <= 20){
                        System.out.println("Balık burcu");
                    }else{
                        System.out.println("Koç burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 4:
                if (day >=1 && day <= 30){
                    if (day <= 20){
                        System.out.println("Koç burcu");
                    }else{
                        System.out.println("Boğa burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 5:
                if (day >=1 && day <= 31){
                    if (day <= 21){
                        System.out.println("Boğa burcu");
                    }else{
                        System.out.println("İkizler burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 6:
                if (day >=1 && day <= 30){
                    if (day <= 22){
                        System.out.println("İkizler burcu");
                    }else{
                        System.out.println("Yengeç burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 7:
                if (day >=1 && day <= 31){
                    if (day <= 22){
                        System.out.println("Yengeç burcu");
                    }else{
                        System.out.println("Aslan burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 8:
                if (day >=1 && day <= 31){
                    if (day <= 22){
                        System.out.println("Aslan burcu");
                    }else{
                        System.out.println("Başak burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 9:
                if (day >=1 && day <= 30){
                    if (day <= 22){
                        System.out.println("Başak burcu");
                    }else{
                        System.out.println("Terazi burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 10:
                if (day >=1 && day <= 31){
                    if (day <= 22){
                        System.out.println("Terazi burcu");
                    }else{
                        System.out.println("Akrep burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 11:
                if (day >=1 && day <= 30){
                    if (day <= 21){
                        System.out.println("Akrep burcu");
                    }else{
                        System.out.println("Yay burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            case 12:
                if (day >=1 && day <= 31){
                    if (day <= 21){
                        System.out.println("Yay burcu");
                    }else{
                        System.out.println("Oğlak burcu");
                    }
                }else {
                    System.out.println("Geçersiz gün girildi");
                }
                break;
            default:
                System.out.println("Geçersiz ay girildi ");

        }


    }
}
