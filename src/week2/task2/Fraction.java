package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if (b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int tu = other.numerator * this.denominator + other.denominator * this.numerator;
        int mau = other.denominator * this.denominator;
        int i = gcd(tu,mau);
        Fraction ps = new Fraction((tu/i), (mau/i));
        return ps;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int tu = this.numerator * other.denominator - this.denominator* other.numerator;
        int mau = other.denominator * this.denominator;
        int i = gcd(tu,mau);

        Fraction ps = new Fraction((tu/i), (mau/i));
        return ps;
    }
    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int tu = other.numerator * this.numerator;
        int mau = other.denominator * this.denominator;
        int i = gcd(tu,mau);

        Fraction ps = new Fraction((tu/i), (mau/i));
        return ps;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int tu = this.numerator * other.denominator;
        int mau = other.numerator * this.denominator;
        int i = gcd(tu,mau);

        week2.task2.Fraction ps = new week2.task2.Fraction((tu/i), (mau/i));
        return ps;
    }
    public boolean equals(Object obj){
        Fraction ps = (Fraction)obj;

        if((float)(numerator)/(denominator) == (float)(ps.numerator)/(ps.denominator))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Fraction ps1 = new Fraction(0, 2);
        Fraction ps2 = new Fraction(-2, 2);

        System.out.println("Tong hai phan so: " + ps1.add(ps2).numerator + "/" + ps1.add(ps2).denominator);
        System.out.println("Hieu hai phan so: " + ps1.subtract(ps2).numerator + "/" + ps1.subtract(ps2).denominator);
        System.out.println("Tich hai phan so: " + ps1.multiply(ps2).numerator + "/" + ps1.multiply(ps2).denominator);
        System.out.println("Thuong hai phan so: " + ps1.divide(ps2).numerator + "/" + ps1.divide(ps2).denominator);

        if(ps1.equals(ps2)){
            System.out.println("Hai phan so da cho bang nhau");
        }
        else
            System.out.println("Hai phan so da cho khac nhau");
    }
}

