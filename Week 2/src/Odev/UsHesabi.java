package Odev;

import java.util.Scanner; // Scanner sınıfı çağırıldı.

public class UsHesabi { // ÜsHesabı sınıfı oluşturuldu.
    static Scanner scan = new Scanner(System.in); // Sınıf içerisinde scan nesnesi oluşturuldu.

    public static void main(String[] args) {
        int num, result,power; // Değişkenler tanımlandı.
        System.out.print("Taban değerini giriniz : "); // Kullanıcıdan Taban değeri alındı.
        num = scan.nextInt();

        System.out.print("Üs değerini giriniz : "); // Kullanıcıdan Üs alındı.
        power = scan.nextInt();

        result = exponentialNumbers(num, power, 1); // exponentialNumbers metodu çağırıldı ve dönen değer result'a atandı.
        System.out.print("Sonuç : " + result); // Kullanıcıya çıktı sunuldu.

    }
    public static int exponentialNumbers(int base, int power, int result) { // exponentialNumber metodu oluşturuldu.
        // Logic işlemler ile result değeri elde edildi.
        if (power == 0) {
            return result;
        }
        return exponentialNumbers(base, power - 1, base * result);
    }
}

