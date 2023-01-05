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
        for (int x = 0;x <numberOfRows; x++){
            this.board.set(x, new ArrayList<>(numberOfColumns));
            for (int y = 0; y < numberOfColumns; y++) {
                this.board.get(x).set(y, new Field(x,y));
            }
        }

    }

    public Map(){
        this(10, 10);
    }

    public void display() {
        for (var row: board) {
            for (var col: row) {
                System.out.printf(col.toString());
            }
        }
    }
}
