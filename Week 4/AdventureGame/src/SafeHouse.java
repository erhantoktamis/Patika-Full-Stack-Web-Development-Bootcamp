public class SafeHouse extends NormalLoc {
   SafeHouse(Player player) {
        super(player, "Safe House");
    }
    public boolean getLocation() {
       player.setHealthy(player.getrHealthy());
        System.out.println("Your rights are refreshed!");
        System.out.println("You are in the safe house now");
       return true;
    }
}
