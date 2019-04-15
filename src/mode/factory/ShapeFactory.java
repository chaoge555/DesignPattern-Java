package mode.factory;

public class ShapeFactory {
    public Shape getShape(String name){
        if (name.equals("Circle")) {
            return new Circle();
        }else if(name.equals("Rectangle")){
            return new Rectangle();
        }else if(name.equals("Square")){
            return new Square();
        }else
            return new NullShape();
        }
}
