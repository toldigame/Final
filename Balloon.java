public class Balloon {
    private int health;
    private String colour;
    private String defenceItem;

    public Balloon(String defenceItem, String colour) {
        this.defenceItem = defenceItem;
        this.colour = colour;
        this.health = 100;
    }

    public String getDefenceItem() {
        return defenceItem;
    }

    public void changeHealth(int value) {
        health += value;
    }

    public boolean checkHealth() {
        return health <= 0;
    }
}