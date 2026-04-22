package entyti;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hero {

    private String name;
    private int lvl;
    private int health;
    private Weapon weapon;
    private List<Weapon> inventory;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();

    }

    public void pickUpWeapon(Weapon weapon) {
        this.inventory.add(weapon);
    }

    public void equip(String weaponTitle) {
        this.inventory.stream()
                .filter(w -> w.getTitle().equals(weaponTitle))
                .max(Comparator.comparingInt(Weapon::getDamage))
                .ifPresentOrElse(
                        foundWeapon -> {
                            this.weapon = foundWeapon;
                            System.out.println(this.name + " взял в руки " + weaponTitle);
                        },
                        () -> System.out.println("оружие " + weaponTitle + " не найдено")
                );
    }
}
