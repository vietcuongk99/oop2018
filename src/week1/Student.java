package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai báo các phương thức getter, setter cho Student

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getID(){
        return id;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }



    /**
     * Constructor 1
     */

    Student() {

        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";

    }

    /**
     * Constructor 2
     */

    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     */

    Student(week1.Student s) {
        // TODO:

        name = s.name;
        id = s.id;
        email = s.email;
        group = s.group;
    }

    String getInfo() {
        // TODO:

        System.out.println(getName());
        System.out.println(getID());
        System.out.println(getGroup());
        System.out.println(getEmail());

        return null;

    }
}
