package main;

import shape.Shape;
import shapefactory.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Triangle");
        shape.draw();


    }
}
