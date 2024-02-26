import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını belirleyiniz : ");
        n = input.nextInt();
        
        for (int e = 4; e <= n; e *= 4) {
            System.out.println(e);
        }

        System.out.println("--------------");

        for (int t = 5; t <= n; t *= 5) {
            System.out.println(t);
        }
    }
}