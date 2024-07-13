package chess.model;

import chess.utils.Point;

public  class King extends Piece {

    public King(Point point, boolean isWhite, String type) {
        super(point, isWhite, type);
        this.type = "King";

    }
}