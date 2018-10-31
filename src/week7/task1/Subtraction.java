package week7.task1;

public class Subtraction extends BinaryExpression {

    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left().evaluate() - right().evaluate();
    }

    @Override
    public String toString() {
        return String.format("%s - %s",left(),right());
    }
}
