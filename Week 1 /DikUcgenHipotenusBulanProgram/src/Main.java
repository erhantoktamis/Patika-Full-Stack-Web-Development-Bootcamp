import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, c, cevre, alan;

        Scanner kenarInput = new Scanner(System.in);

        System.out.print("Lütfen a değerini giriniz : " );
        a = kenarInput.nextDouble();
        System.out.print("Lütfen b değer giriniz : " );
        b = kenarInput.nextDouble();
        System.out.print("Lütfen c değer giriniz : " );
        c = kenarInput.nextDouble();

        cevre = (a + b + c) / 2;
        alan  =  Math.sqrt(cevre * (cevre - a)* (cevre - b) * (cevre - c));
        System.out.println("Alan :" + alan);

    }
}