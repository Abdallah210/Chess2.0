package chess.model;

import chess.utils.Point;

public  class Cell {

    private Point point;
    private boolean isWhite;
    private boolean isEmpty;
    private Piece piece;
    private String name;
    
    public Cell(Point point, boolean isWhite){

        this.point = point;
        this.isWhite = isWhite;
        this.isEmpty = true;
        this.piece = null;

        // (this.name)
        switch (this.point.getX()) {
            case 0:
                this.name = "a" + this.point.getY()+1;
                break;
            case 1:
                this.name = "b" + this.point.getY()+1;
                break;
            case 2:
                this.name = "c" + this.point.getY()+1;
                break;
            case 3:
                this.name = "d" + this.point.getY()+1;
                break;
            case 4:
                this.name = "e" + this.point.getY()+1;
                break;
            case 5:
                this.name = "f" + this.point.getY()+1;
                break;
            case 6:
                this.name = "g" + this.point.getY()+1;
                break;
            default:
                this.name = "h" + this.point.getY()+1;
                break;
        } 
    }


    
    // Getters and setters :

    public Point getPoint() {
        return this.point;
    }

    public void setPoint(Point p) {
        this.point = p;
    }

    public Piece getPiece() {
        return piece;
    }
    
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public String getName() {
        return name;
    }

}