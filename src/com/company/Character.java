package com.company;

import java.util.Random;

public class Character {

    private String name;
    private float strength;
    private float height;
    private float stamina;

    @Override
    public String toString() {
        return "Character " +
                  name +
                ": strength=" + strength +
                ", height=" + height +
                ", stamina=" + stamina +
                ", dexterity=" + dexterity +
                ", speed=" + speed
                ;
    }

    private float dexterity;
    private float speed;

    public Character(String name) {

        Random random = new Random();

        this.name = name;
        this.strength = randomStat();
        this.height = (random.nextFloat() / 2) + 1; //height in metres between 1.5 and 2m
        this.stamina = randomStat();
        this.dexterity = randomStat();
        this.speed = random.nextInt(11) + 20;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(float strength) {
        if (strength >= 0) {
            this.strength = strength;
        }
    }

    public void setHeight(float height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public void setStamina(float stamina) {
        if (stamina >= 0) {
            this.stamina = stamina;
        }
    }

    public void setDexterity(float dexterity) {
        if (dexterity >= 0) {
            this.dexterity = dexterity;
        }
    }

    public void setSpeed(float speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public String getName() {
        return name;
    }

    public float getStrength() {
        return strength;
    }

    public float getHeight() {
        return height;
    }

    public float getStamina() {
        return stamina;
    }

    public float getDexterity() {
        return dexterity;
    }

    public float getSpeed() {
        return speed;
    }

    public float randomStat() {
        Random random = new Random();
        return random.nextInt(11) + 8;
    }

}
