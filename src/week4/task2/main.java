package week4.task2;

public class main {
    public static void main(String[] args) {

        Shape s = new Shape("red", true);
        System.out.println(s.toString());

        Circle c = new Circle(5);
        System.out.println(c.toString());
        System.out.println("Circle Area: "+ c.getArea(5));
        System.out.println("Circle Perimeter: "+ c.getPerimeter(5));

        Rectangle r = new Rectangle(5,10);
        System.out.println(r.toString());
        System.out.println("Rectangle Area: "+ r.getArea(5, 10));
        System.out.println("Rectangle Perimeter: "+ r.getPerimeter(5, 10));

        Square sq = new Square(9);
        System.out.println(sq.toString());

    }
}
