package abstractFactorypattern;

/**
 * 颜色工厂类
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String sharp) {
        return null;
    }

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }
        switch (color) {
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            default:
                return null;
        }
    }
}
