import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Değişkenler tanımlandı.
        String userName, password, newPassword;
        int s1, s2, result;

        // Scanner sınıfı tanımlandı.
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : "); // Kullanıcıdan bilgileri istendi.
        userName = inp.nextLine();

        System.out.print("Şifre : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Hoşgeldiniz !");
        } else {
            System.out.print("Hatalı Giriş yaptınız. Şifrenizi sıfırlamak ister misiniz?\n 1-Evet 2-Hayır :");
            result = inp.nextInt(); // Kullanıcıya şifre sıfırlama isteği soruldu.
            if (result == 1) {
                System.out.print("Yeni şifrenizi giriniz : ");
                inp = new Scanner(System.in);
                newPassword = inp.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    System.out.print("Yeni şifrenizi giriniz : ");
                    newPassword = inp.nextLine();
                    if (newPassword.equals("java123")) {
                        System.out.print("Şifre oluşturulamadı.");
                    } else {
                        System.out.print("Şifre oluşturuldu, Hoşgeldiniz.");
                    }
                } else {
                    System.out.print("Şifre oluşturuldu, Hoşgeldiniz.");
                }
            } else if  (result == 2) {
                System.out.print("Tekrar deneyinz.");
            }
        }
    }
}