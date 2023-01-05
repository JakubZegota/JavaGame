package com.company.fieldObjects;

public class Warrior extends Troop implements ICanMove{
    public Warrior(float HP, float damage, int range, int speed) {
        super(HP, damage, range, speed);
    }
    public Warrior() {
        super(100, 30, 1, 1);
    }
    @Override
    public void move() {

    }
}
