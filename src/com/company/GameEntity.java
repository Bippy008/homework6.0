package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private WeaponTypes attackType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public WeaponTypes getAttackType() {
        return attackType;
    }

    public void setAttackType(WeaponTypes attackType) {
        this.attackType = attackType;
    }
}
