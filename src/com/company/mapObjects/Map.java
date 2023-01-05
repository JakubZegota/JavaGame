package com.company.mapObjects;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int numberOfColumns; // lista kolumn
    private int numberOfRows; //lista wierszy
    private List<List<Field>> board;

    public Map(int numberOfColumns, int numberOfRows) {
        this.numberOfColumns = numberOfColumns;
        this.numberOfRows = numberOfRows;
        this.board = new ArrayList<>(this.numberOfRows);
        for (int x = 0;x <this.numberOfRows; x++){
            this.board.add(x, new ArrayList<>(numberOfColumns));
            for (int y = 0; y < this.numberOfColumns; y++) {
                this.board.get(x).add(y, new Field(x,y));
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
