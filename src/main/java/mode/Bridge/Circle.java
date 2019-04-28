package mode.Bridge;

public class Circle extends Shape {
    private int x, y, redius;

    public Circle(int x, int y, int redius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.redius = redius;
    }

    @Override
    public void draw() {
        System.out.println("画半径为" + redius + ",x为" + x + ",y为" + y);
        drawAPI.drawColor();
    }
}
