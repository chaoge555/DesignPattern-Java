package mode.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    public void draw() {
        decoratorShape.draw();
        serRedBorder();

    }

    private void serRedBorder() {
        System.out.println("线的颜色：红色");
    }
}
