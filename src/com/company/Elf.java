package com.company;

public class Elf extends Character {

    private float accuracy;

    public float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(float accuracy) {
        if (accuracy >= 0) {
            this.accuracy = accuracy;
        }
    }

    public Elf(String name) {
        super(name);
        setSpeed(getSpeed() * 1.5f); //1.5x speed
        this.accuracy = randomStat();
    }
}
