import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int e, sayiMiktari, girilenSayi, max = 0, min = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        sayiMiktari = input.nextInt();

        for (int i = 1; i <= sayiMiktari; i++) {
            System.out.print("Lütfen " + i + ". Sayıyı Giriniz : ");
            girilenSayi = input.nextInt();

            if (i == 1) {
                max = girilenSayi;
                min = girilenSayi;
            }

            if (girilenSayi > max) {
                max = girilenSayi;
            }
            if (girilenSayi < min) {
                min = girilenSayi;
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);













    }
}