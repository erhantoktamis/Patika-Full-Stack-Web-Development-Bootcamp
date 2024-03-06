package Pratik.Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class MinMax {
    public static void main(String[] args) {
        int number1, tempNumber, nearToSmall, nearToBig;
        Scanner scan = new Scanner(System.in);

        int array[] = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(array);

        System.out.print("Değer giriniz : ");
        number1 = scan.nextInt();

        nearToSmall = array[0];
        nearToBig = array[array.length-1];

        for (int i : array) {
            if (i < number1) {
                nearToSmall = i;
            } else if (i > number1) {
                nearToBig = i;
                break;
            }
        }

        System.out.println("en küçük yakın : " + nearToSmall);
        System.out.println("en büyük yakın : " + nearToBig);
    }
}
