package week5_6;

/**
 *  class này dùng để biểu diễn các Rectangle kế thừa từ Shape
 * @see Shape
 */

public class Rectangle extends Shape{

    private Coordinate a;
    private Coordinate b;
    private Coordinate c;
    private Coordinate d;

    public Coordinate getA() {
        return a;
    }

    public void setA(Coordinate a) {
        this.a = a;
    }

    public Coordinate getB() {
        return b;
    }

    public void setB(Coordinate b) {
        this.b = b;
    }

    public Coordinate getC() {
        return c;
    }

    public void setC(Coordinate c) {
        this.c = c;
    }

    public Coordinate getD() {
        return d;
    }

    public void setD(Coordinate d) {
        this.d = d;
    }

    public Rectangle(String color, boolean filled, Coordinate a, Coordinate b, Coordinate c, Coordinate d) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle() {

    }
    /**
     * phương thức giúp tính chieu dai cua hình chữ nhật
     * @return length
     */
    public double getLength() {
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
    }

    /**
     * phương thức giúp tính chieu rong cua hình chữ nhật
     * @return width
     */
    public double getWidth() {
        return Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                '}';
    }
}
