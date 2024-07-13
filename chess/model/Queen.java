package chess.model;

import chess.utils.Point;

public  class Queen extends Piece{

    public Queen(Point point, boolean isWhite, String type) {
        super(point, isWhite, type);
        this.type = "Queen";

    }
}