package mode.abstractfactory;

public class FactorypatterDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();

        AbstractFactory colorFactory = new ColorFactory();
        Color red = colorFactory.getColor("Red");
        red.fill();
        Color green = colorFactory.getColor("Green");
        green.fill();
        Color blue = colorFactory.getColor("Blue");
        blue.fill();
    }
}
