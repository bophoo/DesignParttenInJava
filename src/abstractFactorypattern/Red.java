package abstractFactorypattern;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Red::fill\n");
    }
}