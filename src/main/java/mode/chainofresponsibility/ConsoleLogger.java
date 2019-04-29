package mode.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("标准的控制台日志：" + message);
    }
}
