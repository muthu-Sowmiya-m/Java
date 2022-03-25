package HackerRank.Datastructures;
import java.util.*;

class Student
{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa)
    {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId()
    {
        return id;
    }
    public String getFname()
    {
        return fname;
    }
    public double getCgpa()
    {
        return cgpa;
    }
}

/* Arranging Cgpa in Descending order
*   If Cgpa same order by Name
*   IF Name also same order by Id*/

//Defining a class to implement Comparator
class Checker1 implements Comparator<Student>
{
    @Override
    public int compare(Student a,Student b)
    {
        if(a.getCgpa() == b.getCgpa())
        {
            if((a.getFname() .compareTo(b.getFname() )==0))
            {
                return a.getId()-b.getId();
            }
            else
            {
                return a.getFname() .compareTo(b.getFname());
            }
        }
        else if(a.getCgpa() > b.getCgpa())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
public class Comparators2
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        Checker1 checker = new Checker1();
        while(testCases>0)
        {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList,checker);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



