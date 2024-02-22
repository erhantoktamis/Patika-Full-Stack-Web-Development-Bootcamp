import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a ,b, c, sonuc; // Değişkenler tanımlandı.
        Scanner inp = new Scanner(System.in); // Scanner sınıfı tanımlandı.

        System.out.print("Lütfen A Sayısını Giriniz  : ");
        a = inp.nextInt();

        System.out.print("Lütfen B Sayısını giriniz : ");
        b = inp.nextInt();

        System.out.print("Lütfen C Sayısını Giriniz: ");
        c = inp.nextInt();

        sonuc = a + b * c - b; // Matematiksel işlem ile sonuc hesaplandı.
        System.out.print("Aritmetik İşleminizin Sonucu : " + sonuc); // İşlemin sonucu yazdırıldı

    }
}