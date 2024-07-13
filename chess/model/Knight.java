package chess.model;

import chess.utils.Point;

public  class Knight extends Piece{

    public Knight(Point point, boolean isWhite, String type) {
        super(point, isWhite, type);
        this.type = "Knight";

    }
}