package pl.javastart.model;

public class Point {
    private double pointX;
    private double pointY;

    public Point() {
    }

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public boolean iQuadrant(){
        return pointX > 0 && pointY > 0;
    }

    public boolean iiQuadrant(){
        return pointX < 0 && pointY > 0;
    }
    public boolean iiiQuadrant(){
        return pointX < 0 && pointY < 0;
    }
    public boolean ivQuadrant(){
        return pointX > 0 && pointY < 0;
    }

    public  boolean ifXAxis(){
        return pointY == 0;
    }

    public  boolean ifYAxis(){
        return pointX == 0;
    }

    public boolean ifOrigin(){
        return pointX == 0 && pointY == 0;
    }
}
