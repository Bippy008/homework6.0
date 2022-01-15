package com.company;

public class Boss extends GameEntity {
    private Weapon bossWeapon;

    public Boss(Weapon bossWeapon, int health, int damage) {
        setBossWeapon(bossWeapon);
        setHealth(health);
        setDamage(damage);
    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public void bossInfo() {
        System.out.println("Оружие: " + bossWeapon.getWeaponName() + " " + bossWeapon.getWeaponType());
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Урон: " + getDamage());
    }

}
