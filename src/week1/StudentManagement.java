

public class StudentManagement {
    private Student[] students = new Student[100];

    /* method: students have same group */
    public boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());

    }


    /*method : print students have same group*/
    public void studentByGroup(){
        int n=0;
        for(int i=0;students[i]!=null;i++){
            n++;
        }
        for(int i=0 ; i < n ; i++)
        {
            boolean check=true;
            for (int j=0;j<i;j++)
                if (students[i].getGroup().equals(students[j].getGroup())){
                    check = false;
                    break;
                }
            if (check==true) {
                System.out.println("Group " + students[i].getGroup() + ":");
                for (int j = i; j < n; ++j)
                    if (students[i].getGroup().equals(students[j].getGroup())) {
                        System.out.println(students[j].getId()+"---"+students[j].getName());

                    }
            }

        }
    }

    /*method: remove students have sample id*/
    public void removeStudent(String id ){
        int n=0;
        for(int i=0;students[i]!=null;i++){
            n++;
        }
        for(int i=0; i<n; i++)
            while (students[i] != null && students[i].getId() == id){
                n--;
                for(int j= i; j<n;j++)
                    students[j]=students[j+1];
                students[n]= null;
            }
    }


    public static void main(String[] args)
    {



        /* task 1 */
        Student s = new Student();
        s.setName("Duong Phuong Nam");
        s.setid("17020908");
        s.setGroup("INT22042");
        s.setEmail("namduongkiwi@gmail.com");

        System.out.println(s.getName());
        s.getInfo();


        /*task 2*/
        Student s1 = new Student("vu duc minh", "17021234", "vuminh@gmail.com");
        s1.setGroup("1");

        Student s2 = new Student("Pham Nguyen Nam Duong", "17029800", "namdz@gmail.com");
        s2.setGroup("2");

        Student s3 = new Student("Pham Nam Duong", "17028090","faker@gmail.com");
        s3.setGroup("2");

        Student s4 = new Student("Nam Duong Pham Nguyen", "17029080", "nampro@gmail.com");
        s4.setGroup("2");

        Student s5 = new Student("Mnh duc Vu", "17024321", "minhfdfdfdfd");
        s5.setGroup("1");


        StudentManagement sm = new StudentManagement();

        /* task 3*/
        if(sm.sameGroup(s2, s3)) {
            System.out.println("Same Group");
        }
        else {
            System.out.println("Not same");
        }

        if(sm.sameGroup(s1, s3)) {
            System.out.println("Same Group");
        }
        else {
            System.out.println("Not same");
        }




        /* task 4*/
        sm.students[0] = s1;
        sm.students[1] = s2;
        sm.students[2] = s3;
        sm.students[3] = s4;
        sm.students[4] = s5;

        sm.studentByGroup();




        /*task 5*/
        sm.removeStudent("17021234");




    }
}