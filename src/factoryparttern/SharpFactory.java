package factoryparttern;


/**
 * 图形工厂，根据图形类型返回对应图形类
 */
public class SharpFactory {
    public static Shape getSharp(String sharpType) {
        switch (sharpType) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
