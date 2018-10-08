package week4.task2;

/**
 *  class này dùng để biểu diễn các Rectangle kế thừa từ Shape
 * @see Shape
 */

public class Rectangle extends Shape{

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * phương thức giúp tính chu vi hình chữ nhật
     * @param width
     * @param length
     * @return perimeter
     */
    public double getPerimeter(double width, double length) {
        return (width+length)*2;
    }
    /**
     * phương thức giúp tính diện tích hình chữ nhật
     * @param width
     * @param length
     * @return area
     */
    public double getArea(double width, double length) {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
