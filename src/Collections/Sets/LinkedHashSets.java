package Sets;

import java.util.*;

// LinkedHashSet similar to hashset but maintains insertion order
//Doesn't allow duplicates

class Student
{
    int rollNo;
    String name;

    Student(int r, String s)
    {
        rollNo = r;
        name = s;
    }
}

public class LinkedHashSets
{
    public static void main(String[] args)
    {
        // Objects of Student
        Student stu1 = new Student(1, "Akshay");
        Student stu2 = new Student(2, "Bina");
        Student stu3 = new Student(3, "Bina");
        Student stu4 = new Student(4, "Dheeraj");

        // New empty LinkedHashSet of type Student
        LinkedHashSet<Student> set = new LinkedHashSet<>();

        // Add objects to set
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        for(Student str : set)
        {
            System.out.println(str.rollNo +" " +str.name);
        }

        /*Adding duplicate object to set this object doesn't add to set
        since sets uses equals() and hash() method*/

        set.add(stu2);

        //Checking whether a value is present or not
        if (set.contains(stu4))
        {
            System.out.println(stu4.name+ " is present in set.");
        }
        else
        {
            System.out.println(stu4.name+ " is not present in set.");
        }
    }
}
