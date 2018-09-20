package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] arr = new Student[100];


    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:

    }

    public static void main(String[] args) {
        // TODO:
        Student s = new Student();
        Student s0 = new Student();
        Student s1 = new Student();
        Student s2 = new Student();

        Student s3 = new Student("Dinh Viet Cuong", "17020624", "uet@vnu.edu.vn");

        Student s4 = new Student(s3);


        s0.setName("Nguyen Van A");
        s0.setID("17020624");
        s0.setGroup("INT22041");
        s0.setEmail("uetmail@vnu.edu.vn");

        s1.setName("Nguyen Van B");
        s1.setID("17020625");
        s1.setGroup("INT22042");
        s1.setEmail("uetmail@vnu.edu.vn");

        s2.setName("Nguyen Van C");
        s2.setID("17020626");
        s2.setGroup("INT22042");
        s2.setEmail("uetmail@vnu.edu.vn");


        s.getInfo();
        s3.getInfo();
        s4.getInfo();


        System.out.println("Compare s1 and s2 group: " + sameGroup(s1,s2));
        System.out.println("Compare s0 and s2 group: " + sameGroup(s0,s2));
        System.out.println("Compare s1 and s0 group: " + sameGroup(s1,s0));

    }
}
