package chess.model;

import chess.utils.Point;

public  class Pawn extends Piece{

    public Pawn(Point point, boolean isWhite, String type) {
        super(point, isWhite, type);
        this.type = "Pawn";

    }
}