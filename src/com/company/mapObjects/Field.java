package com.company.mapObjects;

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

    @Override
    public String toString() {
        return " {" +coordinates +
                ", troops=" + troops +
                '}';
    }
}
