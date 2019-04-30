package mode.interpreter;

public class AndExpression implements Expression {
    private Expression expressionOne = null;
    private Expression expressionTwo = null;

    public AndExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public boolean interpret(String context) {
        return expressionOne.interpret(context) && expressionTwo.interpret(context);
    }
}
