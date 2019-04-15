package mode.abstractfactory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color.equals("Blue")) {
            return new Blue();
        } else if (color.equals("Green")) {
            return new Green();
        } else if (color.equals("Red")) {
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
