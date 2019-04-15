package mode.factory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
    @Override
    public boolean isNil() {
        return false;
    }
}
