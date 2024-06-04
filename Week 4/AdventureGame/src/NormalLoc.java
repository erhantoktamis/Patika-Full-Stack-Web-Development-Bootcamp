public abstract class NormalLoc extends Location{
    NormalLoc(Player player, String name) {
        super(player);
        this.name = name;
    }
    public boolean getLocation() {
        return true; // game continues in the safe area
    }

}
