package mode.Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redShape = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 95, 10, new GreenCircle());

        redShape.draw();
        greenCircle.draw();
    }
}
