package entyti;

public class Weapon {

    private String title;
    private int damage;

    public Weapon(String title, int damage) {
        this.title = title;
        this.damage = damage;
    }

    public String getTitle() {
        return title;
    }

    public int getDamage() {
        return damage;
    }
}
