

public class StudentManagement
{
    private Student[] students = new Student[100];

    /* method: students have same group */
    public boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());

    }


    /*method : print students have same group*/
    public void studentByGroup()
    {
        int i, j;
        boolean arr[] = new boolean[4];
        for(i = 0; i < 4; i++)
        {
            arr[i] = false;
        }

        for(i = 0; i < 4; i++)
        {

            for(j = i; j < 4; j ++)
            {
                if(students[j].getGroup().equals(students[i].getGroup()) == true && arr[j] == false)
                {
                    arr[j] = true;
                    students[j].getInfo();
                }
            }

        }
    }

    /*method: remove students have sample id*/
    public void removeStudent(String id)
    {
        int i, j, n = 4;
        for(i = 0; i < n && students[i] != null; i++)
        {
            if(students[i].getID().equals(id))
            {
                int m = n - 1;
                for(j = i; j < m; j++)
                {
                    students[j] = students[j + 1];
                }
                System.out.println("done");
                n--;
            }

        }
    }


    public static void main(String args[])
    {



        /* task 1 */
        Student s = new Student();
        s.setName("Phung Thi Tuyet Mai");
        s.setID("17020875");
        s.setGroup("K62CD");
        s.setMail("phungtuyet234@gmail.com");

        System.out.println(s.getName());
        s.getInfo();
        System.out.println("-----------------------------");


        /*task 2*/
        Student s1 = new Student();

        Student s2 = new Student("Mai", "17020875", "17020875@vnu.com");

        Student s3 = new Student("Thao", "17028293","17020322@vnu.com");

        s3.setGroup("INT22042");

        Student s4 = new Student(s);


        StudentManagement stm = new StudentManagement();

        /* task 3*/
        if(stm.sameGroup(s2, s3))
        {
            System.out.println("Same Group");
        }
        else
        {
            System.out.println("Unsame Group");
        }

        if(stm.sameGroup(s2, s4))
        {
            System.out.println("Same Group");
        }
        else
        {
            System.out.println("Unsame Group");
        }
        System.out.println("-----------------------------------");




        /* task 4*/
        stm.students[0] = s1;
        stm.students[1] = s2;
        stm.students[2] = s3;
        stm.students[3] = s;

        stm.studentByGroup();
        System.out.println("-----------------------------------");



        /*task 5*/
        stm.removeStudent("17020875");
        System.out.println("-----------------------------------");


    }
}