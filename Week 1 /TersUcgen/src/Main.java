public class Main {
    public static void main(String[] args) {

        int n = 9;
        for(int i = n; i>= 0; i--){
            for(int j = 0; j<=i*2; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}