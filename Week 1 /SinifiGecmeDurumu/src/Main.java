import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenler tanımlandı.
        int matematik, fizik, turkce, kimya, muzik, dersSayisi = 0;
        double ort = 0;

        //Scanner sınıfı tanımlandı.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan veri girişi sağlandı.
        System.out.print("Matematik notunuzu giriniz : ");
        matematik = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        // Girilen notlar kontrol edildi.
        if (matematik > 0 && matematik <= 100 ) {
            ort += matematik;
            dersSayisi += 1;
        }

        if (fizik > 0 && fizik <= 100 ) {
            ort += fizik;
            dersSayisi += 1;
        }

        if (turkce > 0 && turkce <= 100 ) {
            ort += turkce;
            dersSayisi += 1;
        }

        if (kimya > 0 && kimya <= 100 ) {
            ort *= kimya;
            dersSayisi += 1;
        }

        if (muzik > 0 && muzik <= 100 ) {
            ort += muzik;
            dersSayisi += 1;
        }

       // Öğrencinin geçme kalma durumu kontrol edildi.
        ort = (matematik + fizik + turkce + kimya + muzik) / dersSayisi;
        if (ort >= 55) {
            System.out.print("Sınıfı geçtiniz");
        }else {
            System.out.print("Sınıfta kaldınız.");
        }

        System.out.print("\nOrtalamanız : " + ort);
    }
}