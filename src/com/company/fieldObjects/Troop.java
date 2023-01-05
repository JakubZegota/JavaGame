package com.company.fieldObjects;

public abstract class Troop {
    private float HP;
    private float damage;
    private int range;
    private int speed;

    public Troop(float HP, float damage, int range, int speed) {
        this.HP = HP;
        this.damage = damage;
        this.range = range;
        this.speed = speed;
    }

    public float getHP() {
        return HP;
    }

    public void setHP(float HP) {
        this.HP = HP;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
