import java.util.Scanner;
// preferred to define methods in Main class.
public class Main {
    // we have to define the method as static to call in main method
       static int add(int a, int b) {
        int result = a + b;
        System.out.println("Total: " +result);
        return result;
    }
    static int sub(int a, int b) {
           int result = a - b;
        System.out.println("Sub: "+result);
        return result;
    }
    static int mul(int a, int b) {
           int result = a*b;
        System.out.println("Mul: "+result);
        return result;
    }
    static int div(int a, int b) {
           if (b == 0) {
               System.out.println("second number should be different from 0");
               return 0; }
        int result = a / b;
        System.out.println("Div: "+result);
        return result;
           }
    static int pow(int a, int b) {
           int result = (int)Math.pow(a, b);
        System.out.println("Pow: "+result);
           return result;
    }
    static int mod(int a, int b) {
           int result = a % b;
        System.out.println("Mod: "+result);
           return result;
       }
       static void calc(int a, int b) {
           System.out.println("Perimeters: " + (2 * (a + b)));
           System.out.println("Area: " + (a*b));
       }
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int select;
     // options list
     String menu =   "1- for addition\n"
                    + "2- for subtraction\n"
                    + "3- for multiplication\n"
                    + "4- for division\n"
                    +"5- for power of the number\n"
                    +"6- for modulus\n"
                    +"7- calculate the area and perimeter of rectangle\n"
                    +"0- sign out\n";
                    System.out.println(menu);
         // if user press 0 key then process will stop
         while (true) {
             System.out.print("Choose your operation: ");
             select = input.nextInt();
             if (select == 0) {
                 System.out.println("you signed out: ");
                 break;
             }
             System.out.print("Enter first num: ");
             int a = input.nextInt();
             System.out.print("Enter second num: ");
             int b = input.nextInt();
             switch (select) {
                 case 1:
                     add(a, b);
                     break;
                 case 2:
                     sub(a, b);
                     break;
                 case 3:
                     mul(a, b);
                     break;
                 case 4:
                     div(a, b);
                     break;
                 case 5:
                     pow(a, b);
                     break;
                 case 6:
                     mod(a, b);
                     break;
                 case 7:
                     calc(a, b);
                     break;
                 default:
                     System.out.println("invalid processing");
             }
         }
       }
}