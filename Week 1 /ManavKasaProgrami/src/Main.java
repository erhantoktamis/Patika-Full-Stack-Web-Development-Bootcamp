import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, toplamTutar; // Değişkenler tanımlandı.
        Scanner input = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner sınıfı tanımlandı.

        System.out.print("Armut Kaç Kilo ? : ");
        armut = input.nextDouble() * 2.14; // Kullanıcının gireceği kg miktarları ile meyvelerin kg fiyatları hesaplandı.

        System.out.print("Elma Kaç Kilo ? : ");
        elma = input.nextDouble() * 3.67;

        System.out.print("Domates Kaç Kilo ? : ");
        domates = input.nextDouble() * 1.11;

        System.out.print("Muz Kaç Kilo ? : ");
        muz = input.nextDouble() * 0.95 ;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = input.nextDouble() * 5.00;

        toplamTutar = (armut + elma + domates + muz + patlican); // Matematiksel işlem ile toplamTutar hesaplandı.
        System.out.print("Toplam Tutar : " + toplamTutar + " TL"); // Kullanıcın ödeyeceği toplam tutar yazdırıldı.
    }
}