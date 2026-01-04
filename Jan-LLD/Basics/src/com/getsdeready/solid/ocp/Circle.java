package com.getsdeready.solid.ocp;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getArea() {
        return (22.0/7) * this.radius * this.radius;
    }
}
