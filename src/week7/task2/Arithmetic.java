package week7.task2;

public class Arithmetic {

    private int numerator;
    private int denomirator;

    public Arithmetic(int numerator, int denomirator) throws ArithmeticException{
        if (denomirator == 0) throw new ArithmeticException();

        this.numerator = numerator;
        this.denomirator = denomirator;
    }

    public static void main(String[] args) {
        try {
            Arithmetic a = new Arithmetic(2,0);
        }
        catch (ArithmeticException e) {
            System.out.println("Khong the co dap an");
        }
    }
}
