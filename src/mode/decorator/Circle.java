package mode.decorator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("形状：圆形");
    }
}
