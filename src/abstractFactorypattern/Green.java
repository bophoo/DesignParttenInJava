package abstractFactorypattern;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Green::fill\n");
    }
}
