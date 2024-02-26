import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        int right = 3, balance = 1500, select, price, cekilenMiktar;
        Scanner input = new Scanner(System.in);


        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = input.nextLine();
            if (userName.equals("Patika") && password.equals("dev123")) {
                System.out.println("Merhaba X Bankasına Hoşgeldiniz!");

                do {

                    System.out.println("1-Para Yatırma\n" +
                    "2-Para Çekme\n" +
                    "3-Bakiye Sorgula\n" +
                    "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Para Miktarı : ");
                        price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para Miktarı : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        }else {
                            balance -= price;
                            
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                }else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }

    }
}