package week5_6;

public class Test {

    public static void main(String[] args) {

        Diagram diagram = new Diagram();

        Layer layer = new Layer();
        Coordinate a = new Coordinate(2,3);
        Coordinate b = new Coordinate(5,3);
        Coordinate c = new Coordinate(5,0);
        Coordinate d = new Coordinate(2,0);
        Coordinate e = new Coordinate(8,3);
        Coordinate f = new Coordinate(8,0);

        layer.shape.add(new Triangle("red", true, a, b, c));
        layer.shape.add(new Rectangle("blue", true, a,e,f,d));
        layer.shape.add(new Circle("green",true, a, 4));


        diagram.layer.add(layer);
        System.out.println("Ban đầu");
        for (int i=0;i<layer.shape.size();i++){
            System.out.println(layer.shape.get(i).toString());
        }
        System.out.println("Sau khi xóa");
        layer.deleteTriagle();
        diagram.deleteCircle();
        for (int i=0;i<layer.shape.size();i++){
            System.out.println(layer.shape.get(i).toString());
        }
    }
}