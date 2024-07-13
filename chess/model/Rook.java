package chess.model;

import chess.utils.Point;

public  class Rook extends Piece{

    public Rook(Point point, boolean isWhite, String type) {
        super(point, isWhite, type);
        this.type = "Rook";

    }
}