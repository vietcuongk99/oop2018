package week4.task2;

/**
 *  class này dùng để biểu diễn các Square kế thừa từ Rectangle
 * @see Rectangle
 */



public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square (String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getSide() {
        return getWidth();
    }


    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                '}';
    }
}
