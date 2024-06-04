import java.util.Scanner;
public class Player {
    private int damage, healthy, money, rHealthy;
    private String name, cName;

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }

    private Inventory inv;
    // We activate the scanner at startup so the player can choose a character.
    Scanner scan = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
        this.inv = new Inventory();
    }
    // select character from charMenu
    public void selectChar() {
      switch(charMenu()) {
          case 1:
              initPlayer("Samurai", 5, 21, 15);
              break;
          case 2:
              initPlayer("Archer", 7, 18, 20);
              break;
          case 3:
              initPlayer("Knight", 8, 24, 5);
              break;
          default:
              initPlayer("Samurai", 5, 21, 15);
              break;
      }
        System.out.println("Character: " +getcName() + ", Damage: " +getDamage() + ", Health: " +getHealthy() + ", Money: " +getMoney());
    }
    public int charMenu() {
        System.out.println("Please choose one character: ");
        System.out.println("1- Samurai\tDamage: 5\tHealth: 21\tMoney: 15");
        System.out.println("2- Archer\tDamage: 7\tHealth: 18\tMoney: 20");
        System.out.println("3- Knight\tDamage: 8\tHealth: 24\tMoney: 5");
        System.out.print("Your character choose: ");
        int charID = scan.nextInt();
        // Checking whether the character selection is selected at the appropriate value is done with the help of a loop.
        while(charID<1 || charID > 3) {
            System.out.print("Please enter valid value: ");
            charID = scan.nextInt();
        }
        return charID;
    }
    // Method that returns total damage
    public int getTotalDamage() {
        return this.getDamage() + this.getInv().getDamage();
    }
    public void initPlayer(String cName, int dmg, int health, int money) {
        setcName(cName);
        setDamage(dmg);
        setHealthy(health);
        setMoney(money);
        setrHealthy(healthy);
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
