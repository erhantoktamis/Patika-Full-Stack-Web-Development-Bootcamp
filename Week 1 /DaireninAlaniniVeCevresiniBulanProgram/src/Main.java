import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            double r, a, pi = 3.14, alan;


            Scanner input = new Scanner(System.in);

            System.out.print("Lütfen yarıçap değerini giriniz : " );
            r  = input.nextDouble();

            System.out.print("Lütfen alfa açısını giriniz : ");
            a = input.nextDouble();

            alan = (pi * (r*r) * a) / 360;
            System.out.println("Daire diliminin alanı : " + alan );

        }
    }
