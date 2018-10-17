package week5_6;
/**
 *  class này dùng để biểu diễn các Circle kế thừa từ Shape
 * @see Shape
 */

public class Circle extends Shape {
    Coordinate a;
    double radius;
    double pi = 3.14;

    public Coordinate getA() {
        return a;
    }

    public void setA(Coordinate a) {
        this.a = a;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
    }


    public Circle(String color, boolean filled, Coordinate a, double radius) {
        super(color, filled);
        this.a = a;
        this.radius = radius;
    }

    /**
     * phương thức giúp tính chu vi hình tròn
     * @param radius
     * @return perimeter
     */
    public double getPerimeter(double radius) {
        return radius*2*pi;
    }

    /**
     * phương thức giúp tính diện tích hình tròn
     * @param radius
     * @return area
     */
    public double getArea(double radius) {
        return radius*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
