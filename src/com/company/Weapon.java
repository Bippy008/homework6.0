package com.company;

public class Weapon {
    private WeaponTypes weaponType;
    private String weaponName;

    public WeaponTypes getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponTypes weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
