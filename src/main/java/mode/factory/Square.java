package mode.factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
    @Override
    public boolean isNil() {
        return false;
    }
}
