public class Main {
    public static void main(String[] args) {

        int numberIsAsal = 0;
        for(int i = 2; i < 100 ; i++){

            numberIsAsal = 0;

            for(int k = 2; k < i; k++){

                if(i % k == 0){
                    numberIsAsal = k;
                    break;
                }

            }
            if(numberIsAsal == 0) {
                System.out.println(i + " sayisi asaldır.");
            }
        }
    }
}