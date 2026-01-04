package com.getsdeready.solid.lsp.shape;

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
