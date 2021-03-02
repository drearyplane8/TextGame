package com.company;

public class Dwarf extends Character{

    private float burrowingRate;

    public Dwarf(String name) {
        super(name);
        setHeight(getHeight() / 2); //half height
        this.burrowingRate = randomStat();
    }

    public float getBurrowingRate() {
        return burrowingRate;
    }

    public void setBurrowingRate(float burrowingRate) {
        if(burrowingRate >= 0) {
            this.burrowingRate = burrowingRate;
        }
    }
}
