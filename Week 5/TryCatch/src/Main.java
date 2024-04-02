import java.security.spec.ECField;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array[] = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("Dizi elemanları : " + Arrays.toString(array));

        System.out.print("İndeks numarası giriniz : ");
        int number = scan.nextInt();

        arrayIndex(array,number);

    }
    public static void arrayIndex(int[] array, int index){
        try {
            System.out.println(array[index]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}