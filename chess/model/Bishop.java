package chess.model;

import chess.utils.Point;

public class Bishop extends Piece {

    public Bishop(Point point, boolean isWhite, String type) {
        super(point, isWhite, type);
        this.type = "Bishop";
    }
    
}