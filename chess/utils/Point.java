package chess.utils;


public class Point {

    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    // Getters and setters :

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    public boolean isPair(){
        if ((this.getX()+this.getY())%2==0) {
            return true;
        } else {
            return false;
        }
    }
    
}