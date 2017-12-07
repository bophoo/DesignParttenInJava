package abstractFactorypattern;

/**
 * 形状工厂类
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }
        switch (shape) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
