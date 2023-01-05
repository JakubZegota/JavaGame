package com.company.fieldObjects;

public class Scout extends Troop implements ICanMove{
    public Scout(float HP, float damage, int range, int speed) {
        super(HP, damage, range, speed);
    }
    public Scout() {
        super(50, 10, 1, 3);
    }
    @Override
    public void move() {

    }
}

