package chess.model;

import chess.utils.Point;

public  class Board {
    
    private Cell[][] cells =  new Cell[8][8];

    public Board(){

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Point point = new Point(i, j);
                if (point.isPair()) {
                    this.cells[i][j] = new Cell(point, true);
                } else {
                    this.cells[i][j] = new Cell(point, false);                
                }
            }        
        }

    }






}