import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int  i = 1, min, number1, number2, ebob = 0, ekok;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        number2 = input.nextInt();

        min = Math.min(number1, number2);

            while (i <= min) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            ekok = (number1 * number2)  / ebob;

            System.out.print("Sayılarınızın Ebob'u : " + ebob + "\n");
            System.out.println("----------------------");
            System.out.print("Sayılarınızın Ekok'u : " + ekok);
    }
}