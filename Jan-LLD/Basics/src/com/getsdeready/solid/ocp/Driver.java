package com.getsdeready.solid.ocp;

public class Driver {

    public static void main(String[] args) {
        Square square = new Square(5.0);
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3, 4);

        Shape[] shapes = {square, circle, rectangle};

        AreaCalculator areaCalculator = new AreaCalculator();
        AreaPrinter areaPrinter = new AreaPrinter();
        double summedArea = areaCalculator.sumArea(shapes);
        areaPrinter.printArea(summedArea);
    }
}
