package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] arr = new Student[100];



    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup()))
            return true;
        else
            return false;
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
        Student s1 = new Student();
        Student s2 = new Student();

        //Student s1 = new Student("Dinh Viet Cuong", "17020624", "uet@vnu.edu.vn");

        //Student s2 = new Student(s1);


        s.setName("Nguyen Van A");
        s.setID("17020624");
        s.setGroup("INT22041");
        s.setEmail("uetmail@vnu.edu.vn");

        s1.setName("Nguyen Van B");
        s1.setID("17020625");
        s1.setGroup("INT22042");
        s1.setEmail("uetmail@vnu.edu.vn");

        s2.setName("Nguyen Van C");
        s2.setID("17020626");
        s2.setGroup("INT22042");
        s2.setEmail("uetmail@vnu.edu.vn");

        /*
        s.getInfo();
        s1.getInfo();
        s2.getInfo();
        */

        System.out.println("Compare s1 and s2 class: " + sameGroup(s1,s2));
        System.out.println("Compare s and s2 class: " + sameGroup(s,s2));
        System.out.println("Compare s1 and s class: " + sameGroup(s1,s));

    }
}
