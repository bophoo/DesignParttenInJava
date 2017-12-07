package abstractFactorypattern;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String sharp);

    abstract Color getColor(String color);

}
