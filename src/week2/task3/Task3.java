package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Gamer {
    private
    String Ingame;  //tên người chơi
    int Level;      //cấp độ
    int Rank;       //bậc xếp hạng
    public gamer(String Ingame, int Level, int Rank){
        this.Ingame = Ingame;
        this.Level = Level;
        this.Rank = Rank;
    }
// các phương thức getter, setter
    public void setIngame(String ingame) {
        Ingame = ingame;
    }

    public String getIngame() {
        return Ingame;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getLevel() {
        return Level;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public int getRank() {
        return Rank;
    }
// các phương thức khác
    public void checkrank(){
        if(this.Rank < 100)
            System.out.println(this.Ingame+ " is a Master");
        else if(this.Rank > 100 && this.Rank < 1000)
            System.out.println(this.Ingame+ " is a good player");
        else System.out.println(this.Ingame+ " is normal player");
    }
    //kiem tra thoi gian choi trong ngay
    public void checktimeplay(int hour){
        if(hour >=16)
            System.out.println(this.Ingame + " only knows how to play and sleep");
        else if(hour >= 8 && hour < 16)
            System.out.println(this.Ingame + " played too much");
        else if( hour > 2 && hour <8)
            System.out.println(this.Ingame + " played a lot");
        else System.out.println(this.Ingame+ " played well");
    }
    //kiểm tra giới tính
    public void checksex(String sex){
        if(sex.equals("Male"))                  //nếu là nam
            System.out.println("All boys play the game");
        else if(sex.equals("Female"))           //nếu là nữ
            System.out.println("Angle is real");
        else System.out.println("what is this?"); // nếu là ...
    }

}
class Teacher{
    private
    String name;            //tên tuổi và giới tính giáo viên
    String sex;
    int age;
    public Teacher(String name, String sex, int tuoi){
        this.age = tuoi;
        this.name = name;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    // tuổi cảu giáo viên
    public void checkage(){
        String n;
        String nh;
        if(this.sex.equals("Male")){
            n = "he";
            nh = "handsome and manly";
        }
        else {
            n = "she";
            nh = "pretty";
        }

        if(this.age < 40){
            System.out.println(n + " is young and " + nh);
        }
        else if(this.age >= 40){
            System.out.println(n + " is not young" );
        }
    }
    //kar năng của thầy giáo với số học dinh điểm trên trung bình và tổng số học sinh
    public void checkscore(int gtf, int full){
        if(gtf >= full*0.8)
            System.out.println("Teacher " + this.getName() + " is Excellent teacher");
        else if(gtf >=0.5*full && gtf < full*0.8)
            System.out.println("Teacher " + this.getName() + " is Good teacher");
        else System.out.println("this class is not good");

    }
    //  set lớp dạy cho giáo viên
    public void setclass(String clas){
        System.out.println(this.getName()+ " is working in " + clas);
    }

}

class tamgiac{
    private
    double a, b, c;
    public  tamgiac(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }
    // kiểm tra tam giác cân đều
    public void checkisos(){
        if(a == b && b == c)
            System.out.println(" tam giác này đều");
        else if(a == b || b == c || c == a)
            System.out.println("tam giác này cân");
        else System.out.println("tam giác này không cân");
    }
    // kiểm tra tam giascc vuông hay không
    public void checksquare(){
        if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b)
            System.out.println("tam giác này vuông");
        else System.out.println("tam giác này không vuông");
    }
    //tính chu vi tam giác
    public double chuvi(){
        return a + b + c;
    }

}

