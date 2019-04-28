package mode.flyweight;

import java.util.UUID;

public class Circle implements Shape {
    private UUID uuid;
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        uuid = UUID.randomUUID();
        this.color = color;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("画圆：颜色：" + color + " x:" + x + " y:" + y + " radius:" + radius);
    }
}
