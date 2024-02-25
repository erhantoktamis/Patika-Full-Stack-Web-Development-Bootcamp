import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil, artikAsir;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = inp.nextInt();
        if (yil % 4 == 0) {
            artikAsir = yil % 400;
            if (artikAsir == 0) {
                System.out.println(yil + " artık yıldır !");
            } else if(artikAsir % 100 == 0) {
                System.out.println(yil + " artık yıl değildir !");
            } else {
                System.out.println(yil + " artık yıldır !");
            }
        } else{
            System.out.println("artık yıl değildir !");
        }
    }
}