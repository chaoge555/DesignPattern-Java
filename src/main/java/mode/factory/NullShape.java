package mode.factory;

public class NullShape implements Shape {
    @Override
    public void draw() {
        System.out.println("没有你想要画得形状");
    }
    @Override
    public boolean isNil() {
        return true;
    }
}
