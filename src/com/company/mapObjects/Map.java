package com.company.mapObjects;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int numberOfColumns; // lista kolumn
    private int numberOfRows; //lista wierszy
    private List<List<Field>> board;

    public Map(int numberOfColumns, int numberOfRows) {
        this.numberOfColumns = numberOfColumns;
        this.numberOfRows = numberOfColumns;
        this.board = new ArrayList<>(numberOfRows);
        for (var row: board) {
            row = new ArrayList<>(numberOfColumns);
        }
    }

    public Map(){
        this(10, 10);
    }

    void display() {

    }
}
