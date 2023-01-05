package com.company.fieldObjects;

public class Archer extends Troop implements ICanMove{
    public Archer(float HP, float damage, int range, int speed) {
        super(HP, damage, range, speed);
    }
    public Archer() {
        super(70, 25, 2, 1);
    }
    @Override
    public void move() {

    }
}
