package com.getsdeready.solid.lsp.calculator;

import com.getsdeready.solid.lsp.shape.Shape;
import com.getsdeready.solid.lsp.shape.ThreeDimensionalShape;

public class VolumeCalculator implements SumCalculator {

    private ThreeDimensionalShape[] shapes;

    public VolumeCalculator(ThreeDimensionalShape[] shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        // logic to calculate volume
        double volume = 0.0;
        for (Shape shape : shapes) {
            volume += ((ThreeDimensionalShape) shape).getVolume();
        }
        return volume;
    }
}
