import java.util.Scanner;

public class SayılarıSıralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("3 sayı giriniz :");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if (n1 > n2 && n1 > n3){
            if (n2 > n3){
                System.out.println("Sıralama bu şekilde olur; "+ n1 +">"+ n2 +">"+ n3);
            } else if (n3 > n2){
                System.out.println("Sıralama bu şekilde olur; "+ n1 +">"+ n3 +">"+ n2);
            }
        }if (n2 > n1 && n2 > n3){
            if (n1 > n3){
                System.out.println("Sıralama bu şekilde olur; "+ n2 +">"+ n1 +">"+ n3);
            } else if (n3 > n1){
                System.out.println("Sıralama bu şekilde olur; "+ n2 +">"+ n3 +">"+ n1);
            }
        }if (n3 > n1 && n3 > n2){
            if (n1 > n2){
                System.out.println("Sıralama bu şekilde olur; "+ n3 +">"+ n1 +">"+ n2);
            } else if (n2 > n1){
                System.out.println("Sıralama bu şekilde olur; "+ n3 +">"+ n2 +">"+ n1);
            }
        }
    }
}
