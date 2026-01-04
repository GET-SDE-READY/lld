package com.getsdeready.solid.ocp;

public class Square implements Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }
}
