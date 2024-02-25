import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat; // Değişken tanımlandı.
        Scanner inp = new Scanner(System.in); // Scanner sınıfı tanımlandı.

        System.out.print("Sıcaklık giriniz : "); // Kullanıcıdan veri alındı.
        heat = inp.nextInt();


        if ( heat < 5) {
            System.out.print("Kayağa gidebilirsiniz."); // Alınan veriye göre Kullanıcıya etkinlik önerildi.
        } else if (heat >= 5 && heat <= 15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if (heat > 15 && heat <= 25) {
            System.out.print("Pikniğe gidebilirsiniz.");
        } else {
            System.out.print("Yüzmeye gidebilirisiniz.");
        }

    }
}