package abstractFactorypattern;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.printf("draw a rectangle\n");
    }
}
