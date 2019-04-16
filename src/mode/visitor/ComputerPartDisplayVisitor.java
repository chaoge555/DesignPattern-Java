package mode.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visitor(Computer computer) {
        System.out.println("显示电脑");
    }

    @Override
    public void visitor(Mouse mouse) {
        System.out.println("显示鼠标");
    }

    @Override
    public void visitor(Keyboard keyboard) {
        System.out.println("显示键盘");
    }

    @Override
    public void visitor(Monitor monitor) {
        System.out.println("显示显示器");
    }
}
