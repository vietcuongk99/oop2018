public class Student {
    private String Name;
    private String Id;
    private String Group;
    private String Email;
    /* non-parameter constructor - default value*/
    public Student(){
        this.Name="Student";
        this.Id="000";
        this.Group="INT22041";
        this.Email="uet@vnu.edu.vn";

    }

    /*constructor - specify parameter*/
    public Student (String n, String i, String e) {
        this.Name=n;
        this.Id=i;
        this.Email=e;
        this.Group="INT22041";
    }
    /* constructor - copy available object*/
    public Student (Student s){
        this.Name=s.getName();
        this.Id=s.getId();
        this.Group=s.getGroup();
        this.Email=s.getEmail();
    }

    /*method : get info*/
    public void getInfo(){
        System.out.println("ten: " + this.Name);
        System.out.println("mssv: " + this.Id);
        System.out.println("nhom: " + this.Group);
        System.out.println("email: " + this.Email);
        System.out.println();
    }

    /*method : name attribute */
    public String getName(){
        return this.Name;
    }
    public void setName(String n){
        this.Name=n;
    }
    /*method: id attribute*/
    public String getId(){
        return this.Id;
    }
    public void setid (String i){
        this.Id=i;
        return;
    }
    /*method : group attribute*/
    public String getGroup(){
        return this.Group;
    }
    public void setGroup(String g){
        this.Group=g;
        return;
    }
    /*method : email conttribute */
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }

}