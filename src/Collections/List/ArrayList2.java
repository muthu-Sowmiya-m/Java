import java.util.*;

class Student
{
    String name,Dep,Sec;
    Student(String name,String Dept,String Sec)
    {
                this.name = name;
                this.Dep = Dept;
                this.Sec = Sec;
    }
}

public class ArrayList2
{
    public static void main(String args[])
    {
        //Array of Objects
        Student s[] = new Student[5];
        s[0] = new Student("Vijay","Cse","A");
        s[1] = new Student("Divya","Cse","B");
        s[2] = new Student("JayaSree","IT","A");

        //List to store Objects
        List <Student> details = new ArrayList<Student>(10);
        //Adding Objects to list
        details.add(s[0]);
        details.add(s[1]);
        details.add(s[2]);

        s[3] = new Student("Sowmiya","Cse","A");
        details.add(s[3]);

        Iterator itr=details.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.name+" "+st.Dep+" "+st.Sec);
        }

    }
}