import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int e, t;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı : ");
        e = input.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        t = input.nextInt();

        int total = 1;

        for (int i = 1; i <= t ; i++) {
            total *= e;
        }
        System.out.print("Cevap : " + total);
    }
}