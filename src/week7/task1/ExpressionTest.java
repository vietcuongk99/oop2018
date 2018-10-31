package week7.task1;

public class ExpressionTest {

    public static void main(String[] args) {
        Expression a = new Numeral(10);
        Expression b = new Numeral(1);
        Expression c = new Numeral(2);
        Expression d = new Numeral(3);
        Expression a2 = new Numeral(0);

        Expression s1 = new Square(a);
        Expression s2 = new Subtraction(s1,b);
        Expression m1 = new Multiplication(c,d);
        Expression a1 = new Addition(s2,m1);
        Expression s3 = new Square(a1);
        Expression d1 = new Division(s3,a2);


        System.out.println(s3);
        System.out.println(s3.evaluate());

        try {

            System.out.println(d1.evaluate());
        }
        catch (ArithmeticException e) {

            System.out.println("Loi chia cho 0");
        }


    }
}
