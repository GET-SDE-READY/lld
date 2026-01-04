package com.getsdeready.solid.srp;

public class AreaCalculator {

    private double area;

    public double calculateArea(Square square) {
        this.area = square.getLength() * square.getLength();
        return area;
    }
}
