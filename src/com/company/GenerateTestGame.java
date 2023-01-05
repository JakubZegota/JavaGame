package com.company;

import com.company.fieldObjects.Archer;
import com.company.fieldObjects.Scout;
import com.company.fieldObjects.Warrior;
import com.company.mapObjects.Coordinates;
import com.company.mapObjects.Map;

public class GenerateTestGame {
    private Map map;

    public GenerateTestGame() {
        this.map = new Map();
        this.map.addToField(new Coordinates(0,0), new Archer());
        this.map.addToField(new Coordinates(0,0), new Scout());
        this.map.addToField(new Coordinates(0, 1), new Warrior());

    }

    public Map getMap() {
        return map;
    }
}
