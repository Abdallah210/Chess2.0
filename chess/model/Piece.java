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

    public int getX() {
        return this.point.getX();
    }

    public void setX(int x) {
        this.point.setX(x);
    }

    public int getY() {
        return this.point.getY();
    }

    public void setY(int y) {
        this.point.setY(y);
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