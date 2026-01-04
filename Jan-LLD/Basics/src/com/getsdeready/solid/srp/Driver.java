package com.getsdeready.solid.srp;

public class Driver {

    public static void main(String[] args) {
        Square square = new Square(5.0);

        AreaCalculator areaCalculator = new AreaCalculator();
        AreaPrinter areaPrinter = new AreaPrinter();
        double area = areaCalculator.calculateArea(square);
        areaPrinter.printArea(area);
    }
}
