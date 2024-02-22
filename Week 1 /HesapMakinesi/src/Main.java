import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, islem;
        double sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşleminiz : ");
        islem = inp.nextInt();

        switch(islem) {
            case 1 :
                System.out.print("Toplama : " + (n1 + n2));
                break;
            case 2 :
                System.out.print("Çıkarma : " + (n1 - n2));
                break;
            case 3 :
                System.out.print("Çarpma : " + (n1 * n2));
                break;
            case 4 :
               switch (n2) {
                   case 0 :
                       System.out.print("Bir sayı 0'a bölünemez. Geçerli bir değer giriniz!");
                       break;
                   default:
                       System.out.print("Bölme : " +  (n1 / n2));
               }
               break;
            default:
                System.out.print("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }

    }
}