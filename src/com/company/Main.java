package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon bossWeapon1 = new Weapon();
        bossWeapon1.setWeaponName("Grogamar");
        bossWeapon1.setWeaponType(WeaponTypes.KINETIC);
        Boss boss = new Boss(bossWeapon1, 1000, 50);
        boss.bossInfo();
    }
}
