import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random()*100); // Generates random numbers between 0 and 100
        Scanner input = new Scanner(System.in); boolean winStatus = false;
        int[] wrongGuess = new int[5];
        int right = 5;
        while (right > 0) {
            System.out.print("Enter your guess: ");
            int userGuess = input.nextInt();
            if ((userGuess < 0) || (userGuess > 100)) {
                System.out.println("Enter value between 0 - 100");
                continue; // continue to take value from user
            }
            if ( userGuess == number) {
                winStatus = true;
                break;
            }
            else {
                System.out.println("Wrong, try again! your remaining right: " +--right);
            }
        }
        if (winStatus) {
            System.out.println("Congratulations, your number guess is correct.");
            System.out.print("Your number: " +number);
            System.out.print("your remaining right:" +right) ;
        }
        else {
            System.out.println("you couldn't win");
        }
}
}