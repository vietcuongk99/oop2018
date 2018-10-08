package week4.task2;


/**
 *  class này dùng để biểu diễn các Circle kế thừa từ Shape
 * @see Shape
 */



public class Circle extends Shape {
    private double radius;
    double pi = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public Circle() {
        super();
    }

    public Circle (double radius) {
        super();
        this.radius= radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
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

    /**
     * phương thức giúp trả về giá trị bán kính của Circle
     * @return radius
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
