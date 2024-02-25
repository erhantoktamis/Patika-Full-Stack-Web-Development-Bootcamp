import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        int n1, n2, n3; // Değişkenler tanımlandı.
        Scanner inp = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        n1 =inp.nextInt(); // Kullanıcıdan veri girişi istendi

        System.out.print("2. sayıyı giriniz : ");
        n2 =inp.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        n3 =inp.nextInt();

        if (n1 < n2 ) { // Girilen veriler kıyaslandı.
            if( n1 < n3) {
                if (n2 < n3) {
                    System.out.println("n3>n2>n1");
                } else {
                    System.out.println("n2>n3>n1");
                }
            } else {
                System.out.println("n2>n1>n3");
            }
        } else {
            if(n1 < n3) {
                System.out.println("n3>n1>n2");
            } else{
                if (n2 < n3) {
                    System.out.println("n1>n3>n2");
                } else {
                    System.out.println("n1>n2>n3");
                }
            }
        }

    }
}