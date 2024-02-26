import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 9;
        Scanner input = new Scanner(System.in);



        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < (5 - i); j++ ) {
                System.out.print(" ");
            }
            for (int k = 0; ; k++) {
                System.out.print("*");
            }
        }


    }
}