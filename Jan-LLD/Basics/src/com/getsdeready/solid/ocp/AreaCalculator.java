package com.getsdeready.solid.ocp;

public class AreaCalculator {

    private double area;

    public double sumArea(Shape[] shapes) {
        double summedArea = 0.0;

        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return summedArea;
    }

//    public double calculateArea(Square square) {
//        this.area = square.getLength() * square.getLength();
//        return area;
//    }
//
//    public double calculateArea(Circle circle) {
//        this.area = (22/7) * circle.getRadius() * circle.getRadius();
//        return area;
//    }
}
