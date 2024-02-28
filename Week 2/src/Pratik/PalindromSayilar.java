package Pratik;
import java.util.Scanner;


public class PalindromSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner sınıfı değişkene atandı.
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt(); // Kullanıcıdan alınan sayı değişkene atandı.

        if (isPalindrom(number)) { // Palindrom metodundan gelen bool değer kontrol edildi.
            System.out.print(number + "' Palindrom bir sayıdır.");
        }else {
            System.out.print(number + "' Palindrom bir sayı değildir.");
        }
    }

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0 , lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (reverseNumber == number) {
            return true;
        }else
            return false;
    }
}

