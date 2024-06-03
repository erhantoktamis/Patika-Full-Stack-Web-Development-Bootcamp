import java.util.Arrays;
public class Main {
    public static void findEvenNum(int[] arr) {
        int[] evenArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(evenArr, 0, index)));
    }
    public static void findAndPrintDuplicatedEvens(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        System.out.println("Tekrar eden çift sayı: " + arr[i]);
                        break; // Tekrar eden bir sayı bulduktan sonra içteki döngüden çık
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {32, 33, 7, 20, 20, 8, 8, 55};
        // Diziyi metoda gönder
        findEvenNum(arr);
        findAndPrintDuplicatedEvens(arr);

    }
}
