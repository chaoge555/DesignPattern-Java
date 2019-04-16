package mode.visitor;

public interface ComputerPartVisitor {
    void visitor(Computer computer);
    void visitor(Mouse mouse);
    void visitor(Keyboard keyboard);
    void visitor(Monitor monitor);
}
