import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double km, kmArtis = 2.20, tutar = 10.0;

       Scanner input = new Scanner(System.in);
        System.out.print("Gidilen KM giriniz : ");
        km = input.nextDouble();
        tutar += km * kmArtis;

        tutar = tutar < 20 ? 20 : tutar;
        System.out.println("Toplam tutar : " + tutar);
        
    }
}