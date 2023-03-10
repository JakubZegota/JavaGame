package com.company.mapObjects;

import com.company.fieldObjects.ICanMove;
import com.company.fieldObjects.Troop;

import java.util.LinkedList;
import java.util.List;

public class Field {
    private Coordinates coordinates;
    private List<Troop> troops;

    public Field(int x, int y) {
        this.coordinates = new Coordinates(x, y);
        troops = new LinkedList<>();
    }

    public void addTroop(Troop t){
    this.troops.add(t);
    }

    @Override
    public String toString() {
        return coordinates + troops.toString()+ " ";
    }
}
