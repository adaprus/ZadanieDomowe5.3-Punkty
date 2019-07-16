package pl.javastart.app;

import pl.javastart.model.LineSegment;
import pl.javastart.model.Point;

public class CalculatorTest {
    public static void main(String[] args) {
        Point point1 = new Point(-2,-2);
        Point point2 = new Point(0,5);
        Point point3 = new Point(4,-1);
        LineSegment segment = new LineSegment(point1, point2);
        Calculator calculator = new Calculator();

        System.out.printf("Długość odcinka to %.2f \n", segment.lineSegmentLength());
        System.out.printf("Długość odcinka to %.2f \n", calculator.lineSegmentLength(point1, point2));
        System.out.println("Czy z podanych punktów można zbudować trójkąt? " + calculator.ifTriangle(point1, point2, point3));
        System.out.println("Czy punkt 1 należy do III ćwiartki? " + point1.iiiQuadrant());
        System.out.println("Czy punkt 2 leży na osi Y? " + point2.ifYAxis());
        System.out.println("Czy punkt 3 leży w środku układu? " + point3.ifOrigin());
    }
}
