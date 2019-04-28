package mode.decorator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("形状：矩形");
    }
}
