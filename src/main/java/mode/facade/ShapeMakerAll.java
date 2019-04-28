package mode.facade;

public class ShapeMakerAll {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMakerAll() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawAll() {
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
