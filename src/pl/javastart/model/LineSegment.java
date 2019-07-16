package pl.javastart.model;

import pl.javastart.model.Point;

public class LineSegment {
    private Point point1;
    private Point point2;

    public LineSegment() {
    }

    public LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public double lineSegmentLength(){
        double length = Math.sqrt(Math.pow(point1.getPointX() - point2.getPointX(), 2)
                + Math.pow(point1.getPointY() - point2.getPointY(), 2)) ;
        return length;
    }
}
