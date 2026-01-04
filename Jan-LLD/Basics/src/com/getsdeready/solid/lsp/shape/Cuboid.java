package com.getsdeready.solid.lsp.shape;

public class Cuboid implements ThreeDimensionalShape {

    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return this.length * this.width * this.height;
    }

    @Override
    public double getArea() {
        return 2 * (this.length * this.width +
                this.width * this.height +
                this.length * this.height);
    }
}
