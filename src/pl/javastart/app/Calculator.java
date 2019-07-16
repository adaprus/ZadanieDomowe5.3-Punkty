package pl.javastart.app;

import pl.javastart.model.Point;

public class Calculator {
    public double lineSegmentLength(Point point1, Point point2) {
        double length = Math.sqrt(Math.pow(point1.getPointX() - point2.getPointX(), 2)
                + Math.pow(point1.getPointY() - point2.getPointY(), 2));
        return length;
    }

    public boolean ifTriangle(Point point1, Point point2, Point point3) {
        if ((point3.getPointY() - point1.getPointY()) * (point2.getPointX() - point1.getPointX())        //(y−yA)(xB−xA)−(yB−yA)(x−xA)=0
                - (point2.getPointY() - point1.getPointY()) * (point3.getPointX() - point1.getPointX()) != 0) {
            return true;
        } else {
            return false;
        }
    }
}

