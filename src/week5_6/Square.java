package week5_6;

/**
 *  class này dùng để biểu diễn các Square kế thừa từ Rectangle
 * @see Rectangle
 */

public class Square extends Rectangle {

    private Coordinate a;
    private Coordinate b;
    private Coordinate c;
    private Coordinate d;

    public Coordinate getA() {
        return a;
    }

    public void setA(Coordinate a) {
        setA(a);
    }

    public Coordinate getB() {
        return b;
    }

    public void setB(Coordinate b) {
        setB(b);
    }

    public Coordinate getC() {
        return c;
    }

    public void setC(Coordinate c) {
        setC(c);
    }

    public Coordinate getD() {
        return d;
    }

    public void setD(Coordinate d) {
        setD(d);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                '}';
    }

}
