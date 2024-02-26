import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int eleman, oncekiToplam = 1, oncekiSayi = 0, toplamSayi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç elemanlı bir seri oluşturmak istiyorsunuz : ");
        eleman = input.nextInt();

        for (int i = 1; i < eleman; i++) {
            toplamSayi = oncekiToplam + oncekiSayi;
            System.out.println(oncekiSayi + " + " + oncekiToplam + " = " + toplamSayi);
            oncekiSayi = oncekiToplam;
            oncekiToplam = toplamSayi;
        }
    }
}