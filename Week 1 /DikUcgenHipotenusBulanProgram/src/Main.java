import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, c, cevre, alan;

        Scanner kisaKenar = new Scanner(System.in);
        Scanner uzunKenar = new Scanner(System.in);
        Scanner hipotenus = new Scanner(System.in);

        System.out.print("Lütfen a değerini giriniz : " );
        a = kisaKenar.nextDouble();
        System.out.print("Lütfen b değer giriniz : " );
        b = uzunKenar.nextDouble();
        System.out.print("Lütfen c değer giriniz : " );
        c = hipotenus.nextDouble();

        cevre = (a + b + c) / 2;
        alan  =  Math.sqrt(cevre * (cevre - a)* (cevre - b) * (cevre - c));
        System.out.println("Alan :" + alan);

    }
}