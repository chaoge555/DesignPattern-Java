package mode.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle =(Circle) shapeMap.get(color);
        if (circle==null){
            circle = new Circle(color);
            shapeMap.put(color,circle);
        }
        return circle;
    }
}
