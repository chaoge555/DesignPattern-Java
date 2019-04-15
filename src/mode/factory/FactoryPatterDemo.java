package mode.factory;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory =new ShapeFactory();
        Shape shape1 =shapeFactory.getShape("Circle");
        Shape shape2 =shapeFactory.getShape("Rectangle");
        Shape shape3 =shapeFactory.getShape("Square");
        Shape shape4 =shapeFactory.getShape("Diamond");
        Shape shape5 =shapeFactory.getShape("");

        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
        shape5.draw();

        System.out.println("shape1空状态："+shape1.isNil());
        System.out.println("shape2空状态："+shape2.isNil());
        System.out.println("shape3空状态："+shape3.isNil());
        System.out.println("shape4空状态："+shape4.isNil());
        System.out.println("shape5空状态："+shape5.isNil());
    }
}
