public abstract class BattleLoc extends Location { // area where the battle took place
   protected Obstacle obstacle;
   protected String award;
    BattleLoc(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
        this.award = award;
    }
    public boolean getLocation() {
        int obsCount = obstacle.count();
        System.out.println("you are in the " +this.getName() + " right now ");
        System.out.println("Be careful there are " + obsCount +" "+obstacle.getName() + " in here ");
        System.out.print("<W> War or <E> Escape :");
        String selCase = scan.nextLine();
        selCase = selCase.toUpperCase();
        if (selCase.equals("W")) {
            combat(obsCount);
            if (combat(obsCount)) { // true condition
                System.out.println("You defeated the enemies in the " +this.getName()+ " area !");
                if(this.award.equals("Food") && player.getInv().isFood() == false) {
                    System.out.println(this.award + " You won! ");
                    player.getInv().setFood(true);
                } else if (this.award.equals("Water") && player.getInv().isWater() == false) {
                    System.out.println(this.award + " You won! ");
                    player.getInv().setWater(true);
                } else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
                    System.out.println(this.award + " You won! ");
                    player.getInv().setFirewood(true);
                }
                return true;
            }
           if (player.getrHealthy() <= 0) { // this condition will execute when return false
               System.out.println("You died !");
                   return false;
           }
        }
        return true; // otherwise, return true;
    }
    public boolean combat(int obsCount) {
        for (int i = 0; i < obsCount; i++) {
            int defObsHealth = obstacle.getHealth();
            playerStats();
            enemyStats();
            // condition for continuation of war
            while(player.getrHealthy() > 0 && obstacle.getHealth() > 0) {
                System.out.print("<H> Hit or <E> Escape : ");
                String selCase = scan.nextLine();
                selCase = selCase.toUpperCase();
                if(selCase.equals("H")) {
                    System.out.println("You hitted !");
                    obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
                    afterHit(); // The method is called after each hit
                    if(obstacle.getHealth() > 0) {
                        System.out.println();
                        System.out.println(obstacle.getName()+ " hit you !");
                        // the armor protects the player
                        player.setHealthy(player.getHealthy() - (obstacle.getDamage()-player.getInv().getArmor()));
                        afterHit();
                    }
                }
                else {
                    return false;
                }
            }
            if(obstacle.getHealth() < player.getHealthy()) { // it means player beaten the obstacle
                System.out.println("You defeated the enemy !");
                // player wins obstacle's awards
                player.setMoney(player.getMoney() + obstacle.getAward());
                System.out.println("Your updated money : " + player.getMoney());
                obstacle.setHealth(defObsHealth);
            }
            else {
                return false;
            }
            System.out.println("---------------------------------------------");
        }
        return true;
    }
  // Method that provides status information of the player
    public void playerStats() {
        System.out.println("Player values\n----------------------------");
        System.out.println("Right: " +player.getHealthy());
        System.out.println("Damage: " +player.getTotalDamage());
        System.out.println("Money: " +player.getMoney());
        if (player.getInv().getDamage() > 0) {
            System.out.println("Weapon: " +player.getInv().getwName());
        }
        if (player.getInv().getArmor() > 0) {
            System.out.println("Armor: " +player.getInv().getaName());
        }
    }
    // Method that provides status information of the enemy
    public void enemyStats() {
        System.out.println("\n" +obstacle.getName() + "'s Values\n----------------------------");
        System.out.println("Right: " +obstacle.getHealth());
        System.out.println("Damage: " +obstacle.getDamage());
        System.out.println("Award: " +obstacle.getAward());
    }
    public void afterHit() {
        System.out.println("Player right: " +player.getHealthy());
        System.out.println(obstacle.getName()+" 's right: " +obstacle.getHealth());
        System.out.println();
    }
}
