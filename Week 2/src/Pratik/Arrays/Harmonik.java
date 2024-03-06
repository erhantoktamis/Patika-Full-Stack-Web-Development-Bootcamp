package Pratik.Arrays;
import java.util.Arrays;

public class Harmonik {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};

        double harmonicSeries = 0;
        for (double i = 1.0 ; i <= array.length; ++i) {
            harmonicSeries += (1 / i);
        }
        System.out.println(harmonicSeries);
        double harmonicMean = 0;
         harmonicMean = (array.length / harmonicSeries);

        System.out.println("Harmonik ortalama formülü : " + harmonicMean);

    }
}
