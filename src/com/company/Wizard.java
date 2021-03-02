package com.company;

public class Wizard extends Character {

    private float magicLevel;

    public float getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(float magicLevel) {
        if (magicLevel >= 0) {
            this.magicLevel = magicLevel;
        }
    }

    public Wizard(String name) {
        super(name);
        this.magicLevel = randomStat();
    }
}
