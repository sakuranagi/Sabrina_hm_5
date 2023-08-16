public class Hero {
    private int health;
    private int damage;
    private String attribute;

    public Hero(int health, int damage, String attribute) {
        this.health = health;
        this.damage = damage;
        this.attribute = attribute;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttribute() {
        return attribute;
    }
}
