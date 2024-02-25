import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        int yas, km, yolculukTipi;
        double normalTutar,mesafeBasiUcret = 0.10, yasIndirimTutar=0, gidisDonusBiletIndirimi=0, toplamTutar=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yaşınız : ");
        yas = inp.nextInt();
        System.out.print("KM giriniz : ");
        km = inp.nextInt();
        System.out.print("Yolculuk tipini seçiniz :\n 1 => Tek Yön , 2 => Gidiş Dönüş : ");
        yolculukTipi = inp.nextInt();

        normalTutar = km * mesafeBasiUcret;
        if (km >= 1 && !(yas <= 0)) {

            if (yas >= 1 && yas <= 11) {
                yasIndirimTutar = normalTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimTutar = normalTutar * 0.10;
            } else if (yas >= 65 && yas < 110) {
                yasIndirimTutar = normalTutar * 0.30;
            }

            switch (yolculukTipi) {
                case 1:
                    toplamTutar = normalTutar-yasIndirimTutar;
                    break;
                case 2:

                    gidisDonusBiletIndirimi = (normalTutar-yasIndirimTutar) * 0.20;
                    toplamTutar = (normalTutar - gidisDonusBiletIndirimi - yasIndirimTutar) * 2;
                    break;
                default:
                    System.out.println("Hatalı Veri Girdiniz !");
                    break;
            }

            System.out.println(toplamTutar);

        } else {
            System.out.print("Hatalı Veri Girdiniz !");
        }


    }
}