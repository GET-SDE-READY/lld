package com.getsdeready.solid.lsp;

import com.getsdeready.solid.lsp.calculator.AreaCalculator;
import com.getsdeready.solid.lsp.calculator.VolumeCalculator;
import com.getsdeready.solid.lsp.shape.*;

public class Driver {

    public static void main(String[] args) {
        Square square = new Square(5.0);
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3, 4);
        Cuboid cuboid = new Cuboid(3.0, 4.0, 5.0);

        Shape[] shapes = {square, circle, rectangle};
        ThreeDimensionalShape[] threeDimensionalShapes = {cuboid};

        AreaCalculator areaCalculator = new AreaCalculator(shapes);
        AreaPrinter areaPrinter = new AreaPrinter(areaCalculator);
        areaPrinter.printArea();

        VolumeCalculator volumeCalculator = new VolumeCalculator(threeDimensionalShapes);
        AreaPrinter volumePrinter = new AreaPrinter(volumeCalculator);

        volumePrinter.printArea();
    }
}
