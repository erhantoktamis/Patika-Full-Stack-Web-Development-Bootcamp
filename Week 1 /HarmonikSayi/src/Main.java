import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        double sonuc = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısını Giriniz : ");
        n = input.nextInt();

        for (double i = 1; i<=n; i++) {
            sonuc += (1/i);
        }

        System.out.print(sonuc);

    }
}