package Odev;

import java.util.Scanner; // Scanner sınıfı çağırıldı.

public class AsalSayi { // AsalSayi sınıfı oluşturuldu.
   static Scanner scan = new Scanner(System.in); // Sınıf içerisinde scan nesnesi oluşturuldu.

    public static void main(String[] args) {
        int number; // Değişken tanımlandı.
        System.out.print("Sayı giriniz : "); // Kullanıcıdan değer alındı.
        number = scan.nextInt();

        if(isPrimeNumber(number, 2)){ // Sorgulanan sayının durumu çıktı olarak verildi.
            System.out.println(number + " sayısı ASALDIR !");
        }
        else{
            System.out.println(number + "sayısı ASAL değildir ! ");
        }
    }
    public static boolean isPrimeNumber(int number, int count) { // isPrimeNumber metodu oluşturuldu.
        if (count >= number && number != 1) { // İf yardımı ile sayının durumu sorgulandı.
            return true;
        }
        if (number % count == 0 || number == 1) {
            return false;
        }
        return isPrimeNumber(number, ++count);

    }
}

