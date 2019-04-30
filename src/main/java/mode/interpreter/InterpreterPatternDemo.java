package mode.interpreter;


public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression exprOne =new TerminalExpression("abcdefgg");
        Expression exprtwo =new TerminalExpression("ggmnxzy");

        Expression orExpr =new OrExpression(exprOne,exprtwo);
        Expression andExpr =new AndExpression(exprOne,exprtwo);

        String dateOne ="abc";
        String dateTwo ="gg";

        System.out.println("dateOne分别用OrExpression与AndExpression解析：");
        System.out.println(orExpr.interpret(dateOne));
        System.out.println(andExpr.interpret(dateOne));

        System.out.println("dateTwo分别用OrExpression与AndExpression解析：");
        System.out.println(orExpr.interpret(dateTwo));
        System.out.println(andExpr.interpret(dateTwo));
    }
}
