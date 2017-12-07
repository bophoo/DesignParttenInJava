package abstractFactorypattern;


public class Square implements Shape {
    @Override
    public void draw() {
        System.out.printf("draw a square\n");
    }
}
