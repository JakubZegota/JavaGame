package com.company.fieldObjects;

public class Wizzard extends Troop implements ICanMove{
    public Wizzard(float HP, float damage, int range, int speed) {
        super(HP, damage, range, speed);
    }
    public Wizzard() {
        super(100, 30, 1, 1);
    }
    @Override
    public void move() {

    }
}
