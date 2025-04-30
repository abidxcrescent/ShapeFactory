package shapefactory;

import shape.Circle;
import shape.Shape;
import shape.Square;
import shape.Triangle;

public class ShapeFactory {
    public Shape getShape(String input) {
        return switch (input) {
            case "Triangle" -> new Triangle();
            case "Square" -> new Square();
            case "Circle" -> new Circle();
            default -> null;
        };
    }
}
