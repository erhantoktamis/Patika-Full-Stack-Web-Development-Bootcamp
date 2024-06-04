import java.util.Scanner;
public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);
    public void login() { // game starts
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Adventure Game!");
        System.out.println("Please enter your name before starting the game: ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectChar();
        start();
    }
    public void start() {
       while (true) {
           System.out.println();
           System.out.println("=============================================================");
           System.out.println();
           System.out.println("Please select a place to game: ");
           System.out.println("1. Safety Home -----> your own safe space, no enemies");
           System.out.println("2. Cave   ----------> zombies may appear");
           System.out.println("3. Forest ----------> vampire may appear");
           System.out.println("4. River -----------> bear may appear");
           System.out.println("5. Store -----> You can buy weapons and armor");
           System.out.print("Where you want to go: ");
           int selLoc = scan.nextInt(); // user's location selection // will added try catch block
           // We validated the selection with a while loop
           while(selLoc<0 || selLoc >5) {
               System.out.print("Please enter valid value");
               // we get value from user until user enters a valid value
               selLoc = scan.nextInt();
           }
           switch(selLoc) {
               case 1:
                   location = new SafeHouse(player);
                   break;
               case 2:
                   location = new Cave(player);
                   break;
               case 3:
                   location = new Forest(player);
                   break;
               case 4:
                   location = new River(player);
                   break;
               case 5:
                   location = new ToolStore(player);
                   break;
               default:
                   location = new SafeHouse(player);
           }
           if(location.getName().equals("Safe House")) { // doesn't work getClass()
               if(player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
                   System.out.println("Congrats you won the game !");
                   break;
               }
           }
          if(!location.getLocation()) {
              System.out.println("Game Over !");
          }
       }
    }
}
