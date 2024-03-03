package Odev;
import java.util.Scanner; // Scanner sınıfı çağırıldı.

public class DeseneGoreMetot { // DeseneGoreMetot sınıfı oluşturuldu.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Sınıf içerisinde scan nesnesi oluşturuldu.
        int number; // Değişken tanımlandı.

        System.out.print("Bir sayı giriniz : "); // Kullanıcıdan değer alındı.
        number = scan.nextInt();

        System.out.print("Sayınızın çıktısı : ");
        methodByPattern(number, number, false);

    }
    public static void methodByPattern(int number ,int result , boolean isResultNegative) { // recursive metod oluşturuldu.

        System.out.print(result + " ");

        if (result >= 0 && !isResultNegative) {
            result = result - 5;
        } else {
            isResultNegative = true;
            result = result+5;
        }
        if (result <= number) {
            methodByPattern(number, result, isResultNegative);
        }
    }

}
