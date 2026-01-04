package com.getsdeready.solid.lsp.calculator;

import com.getsdeready.solid.lsp.shape.Shape;

public class AreaCalculator implements SumCalculator {

    private Shape[] shapes;

    public AreaCalculator(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        double summedArea = 0.0;

        for (Shape shape : shapes) {
            summedArea += shape.getArea();
        }
        return summedArea;
    }
}
