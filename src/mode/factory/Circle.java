package mode.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
    @Override
    public boolean isNil() {
        return false;
    }
}
