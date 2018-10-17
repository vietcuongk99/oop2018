package week5_6;

public class Triangle extends Shape{
    Coordinate a,b,c;

    public Triangle(String color, boolean filled, Coordinate a, Coordinate b, Coordinate c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    public double getSide1() {
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
    }

    public double getSide2() {
        return Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
    }

    public double getSide3() {
        return Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + getSide1() +
                ", side2=" + getSide2() +
                ", side3=" + getSide3() +
                '}';
    }
}