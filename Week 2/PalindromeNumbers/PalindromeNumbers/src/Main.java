import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          // variables are defined
        int  number;
        System.out.println("Enter the nuber");
        Scanner input = new Scanner (System.in);
        number = input.nextInt();
        int reversedNumber = 0, temp = number;
        // while loop condition
        while (temp > 0) {
            int remainder = temp % 10;
            temp = temp / 10;
        }
        if (number == reversedNumber) {
            System.out.println("number is palindrome");
        }
        else
            System.out.println("Number is not palindrome");

        }
    }
