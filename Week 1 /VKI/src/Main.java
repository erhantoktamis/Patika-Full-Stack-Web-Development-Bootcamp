import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double boy, kilo, vki; // Değişkenler tanımlandı.
        Scanner input = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner sınıfı tanımlandı.
        System.out.print("Lütfen boyunuzu giriniz (m) : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz (kg) : ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy); // Matematiksel işlem ile vücut kitle indeksi hesaplandı.
        System.out.print("Vücut Kitle İndeksiniz : " + vki);

    }
}