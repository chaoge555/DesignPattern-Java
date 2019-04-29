package mode.chainofresponsibility;

public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger loggerChain = ChainOfLoggers.getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "这个是普通信息日志");
        loggerChain.logMessage(AbstractLogger.DEBUG, "这个是个debug日志");
        loggerChain.logMessage(AbstractLogger.ERROR, "这个是error日志");
    }
}
