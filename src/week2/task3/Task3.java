package week2.task3;

public class Task3 {


    //TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
    class Cat {
        String name;        // khai báo các thuộc tính cho Cat
        int age;
        String food;

        // khai báo các phương thức getter, setter
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setFood(String food) {
            this.food = food;
        }

        public String getFood() {
            return food;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        // hàm so sánh tuổi mèo
        public boolean sameAge(Object obj) {
            Cat cat = (Cat) obj;
            if ((getAge()) == (cat.getAge()))
                return true;
            else
                return false;
        }

        //hàm in ra đặc điểm của mèo
        void CatInfo() {
            System.out.println("Mèo " + getName());
            System.out.println("Món ăn ưa thích: " + getFood());
            System.out.println("Tuổi của mèo: "+ getAge());
        }

        // hàm in ra tiếng kêu của mèo
        void meow() {
            System.out.println("Mèo kêu: Meow meow.....");
        }

    }
    class Student {
        String name;    //khai báo các thuộc tính cho Student
        int grade;
        int score;

        // khai báo các phương thức getter, setter
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setScore(int score){
            this.score = score;
        }
        public int getScore(){
            return score;
        }
        public void setGrade(int grade){
            this.grade = grade;
        }
        public int getGrade(){
            return grade;
        }

        //hàm so sánh điểm giữa 2 học sinh
        public boolean compare(Object obj) {
            Student s = (Student) obj;
            if ((getScore()) == (s.getScore()))
                return true;
            else
                return false;
        }

        //hàm in ra thông tin 1 học sinh
        void getInfo() {
            System.out.println("Tên: "+ getName());
            System.out.println("Lớp : "+ getGrade());
            System.out.println("Điểm tổng kết cả năm: "+ getScore());
        }

        // hàm in ra học lực 1 học sinh
        void getRank(Student s) {
            if(s.getScore()>9)
                System.out.println("Học lực: Giỏi");
            if(s.getScore()<=9&&s.getScore()>=7)
                System.out.println("Học lực: Khá");
            if(s.getScore()<7)
                System.out.println("Học lực: Trung bình");
        }
    }
    class Phone {
        String name;
        String company;
        int cost;

        Phone[] smp = new Phone[3];

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setCompany(String company){
            this.company = company;
        }
        public String getCompany() {
            return company;
        }
        public void setCost(int cost){
            this.cost = cost;
        }
        public int getCost(){
            return cost;
        }

        void getInfo() {
            System.out.println("Tên smartphone: " + getName());
            System.out.println("Nhà sản xuất: " + getCompany());
            System.out.println("Giá: " + getCost() + " dollar");
        }

        void phoneRate(Phone phone) {
            if (phone.getCost() >= 250)
                System.out.println("Đây là mẫu smartphone cao cấp.");
            else
                System.out.println("Đây là mẫu smartphone phổ thông.");

        }
        void sameCompany(Phone p1, Phone p2) {
            if(p1.getCompany().equals(p2.getCompany()))
                System.out.println(p1.getName()+" và "+p2.getName()+" cùng nhà sản xuất.");
            else
                System.out.println(p1.getName()+" và "+p2.getName()+" khác nhà sản xuất.");
        }

    }
    public static void main(String[] args){

        System.out.println("Ví dụ cho lớp Cat" + "\n");
        Task3 o1 = new Task3();
        Task3 o2 = new Task3();
        Task3.Cat c1 = o1.new Cat();
        Task3.Cat c2 = o2.new Cat();

        c1.setName("Tom");
        c1.setAge(10);
        c1.setFood("Cá rán");
        c2.setName("Kitty");
        c2.setAge(9);
        c2.setFood("Sữa tươi");
        c1.CatInfo();
        c2.CatInfo();
        c1.meow();

        if(c1.sameAge(c2))
            System.out.println("Hai con mèo cùng tuổi nhau" + "\n");
        else
            System.out.println("Hai con mèo khác tuổi nhau" + "\n");

        System.out.println("Ví dụ cho lớp Student" + "\n");
        Task3 o3 = new Task3();
        Task3 o4 = new Task3();
        Task3 sv = new Task3();
        Task3.Student s1 = o3.new Student();
        Task3.Student s2 = o4.new Student();
        Task3.Student stu = sv.new Student();

        s1.setName("NGUYỄN VĂN A");
        s1.setGrade(10);
        s1.setScore(10);
        s2.setName("NGUYỄN VĂN B");
        s2.setGrade(12);
        s2.setScore(8);
        s1.getInfo();
        stu.getRank(s1);
        s2.getInfo();
        stu.getRank(s2);

        if(s1.compare(s2))
            System.out.println("Hai hoc sinh có số điểm giống nhau" +"\n");
        else
            System.out.println("Hai học sinh có số điểm khác nhau" +"\n");

        System.out.println("Ví dụ cho lớp Phone" + "\n");

        Task3 o5 = new Task3();
        Task3 o6 = new Task3();
        Task3 o7 = new Task3();
        Task3 smp = new Task3();
        Task3.Phone p1 = o5.new Phone();
        Task3.Phone p2 = o6.new Phone();
        Task3.Phone p3 = o7.new Phone();
        Task3.Phone phone = smp.new Phone();

        p1.setName("Samsung Note9");
        p1.setCost(1250);
        p1.setCompany("Samsung");
        p2.setName("Iphone X");
        p2.setCost(1000);
        p2.setCompany("Apple");
        p3.setName("Samsung J7");
        p3.setCost(200);
        p3.setCompany("Samsung");

        p1.getInfo();
        phone.phoneRate(p1);
        p2.getInfo();
        phone.phoneRate(p2);
        p3.getInfo();
        phone.phoneRate(p3);


        phone.sameCompany(p1,p2);
        phone.sameCompany(p2,p3);
        phone.sameCompany(p1,p3);


    }
}



