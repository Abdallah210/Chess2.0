package chess.model;

import chess.utils.Point;

public abstract class Piece {

    protected Point point;
    protected boolean isWhite;
    protected String type;
    protected boolean hasMoved;

    public Piece(Point point, boolean isWhite, String type) {
        this.point.setX(point.getX());
        this.point.setY(point.getY());
        this.isWhite = isWhite;
        this.type = type;
        this.hasMoved = false;
    }

    public Point getPoint() {
        return this.point;
    }

    public void setPoint(Point p) {
        this.point = p;
    }


    public boolean isWhite() {
        return this.isWhite;
    }

    public void setWhite(boolean white) {
        this.isWhite = white;
    }

    public String getType() {
        return this.type;
    }

    public boolean hasMoved() {
        return this.hasMoved;
    }

    public void setMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

}