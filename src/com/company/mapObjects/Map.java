package com.company.mapObjects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Map {
    private int size_X; // lista kolumn
    private int size_Y; //lista wierszy
    private List<List<Field>> board;

    public Map(int size_X, int size_Y) {
        this.size_X = size_X;
        this.size_Y = size_Y;
        this.board = new ArrayList<>(size_Y);
        for (var row: board) {
            row = new ArrayList<>(size_X);
        }
    }

    void display() {

    }
}
