import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
            total += i;
            }
        }
            if (total == n) {
                System.out.print(n + " Mükemmel Sayıdır");
            }else {
                System.out.print(n + " Mükemmel Sayı Değildir");
            }
    }
}