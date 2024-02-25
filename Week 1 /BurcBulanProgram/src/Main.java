import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day; // Değişkenler tanımlandı.

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz  ay : ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = inp.nextInt();

        if ((month <= 12 && day <= 31) && !(month < 1) && !(day<1) ) {

            if ((month == 12 && day >= 22) || (month == 1) && (day <= 21)) {
                System.out.print("Burcunuz : Oğlak");
            } else  if ((month == 1 && day > 21 ) || (month == 2) && (day < 20 )) {
                System.out.println("Burcunuz : Kova");
            } else if ((month == 2 && day >= 20 ) || (month == 3) && (day < 21 )) {
                System.out.print("Burcunuz : Balık  ");
            } else if ((month == 3 && day >= 21 ) || (month == 4) && (day < 21 )) {
                System.out.print("Burcunuz : Koç");
            } else if ((month == 4 && day > 21 ) || (month == 5) && (day < 22 )) {
                System.out.print("Burcunuz : Boğa ");
            } else if ((month == 5 && day > 21 ) || (month == 6) && (day < 23 )) {
                System.out.print("Burcunuz : İkizler");
            } else if ((month == 6 && day > 22 ) || (month == 7) && (day < 23)) {
                System.out.print("Burcunuz : Yengeç");
            } else if ((month == 7 && day > 22 ) || (month == 8) && (day < 23 )) {
                System.out.print("Burcunuz : Aslan");
            } else if ((month == 8 && day > 22 ) || (month == 9) && (day < 23 )) {
                System.out.print("Burcunuz : Başak");
            } else if ((month == 9 && day > 22 ) || (month == 10) && (day < 23 )) {
                System.out.print("Burcunuz : Terazi");
            } else if ((month == 10 && day > 22 ) || (month == 11) && (day < 22 )) {
                System.out.print("Burcunuz : Akrep");
            } else if ((month == 11 && day > 21 ) || (month == 12) && (day < 22 )) {
                System.out.print("Burcunuz : Yay");
            }
        } else {
            System.out.print("Yanlış tarih girdiniz");
        }

    }
}
