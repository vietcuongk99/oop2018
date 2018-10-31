package week7.task1;

public class Square extends Expression {

    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {

        return String.format("(%s)^2", expression);
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2);
    }

}
