package mode.visitor;

public class VisitorPatterDemo {
    public static void main(String[] args) {
        Computer computer =new Computer();
        ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();
        System.out.println("访问电脑：");
        computer.accept(computerPartVisitor);
        System.out.println("");
        System.out.println("访问键盘:");
        Keyboard keyboard =new Keyboard();
        keyboard.accept(computerPartVisitor);
    }
}
