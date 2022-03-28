package HackerRank.Datastructures;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Stud
{
    private String name;
    private int id;
    private double cgpa;
    Stud(String name,int id,double cgpa)
    {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public int getID()
    {
        return id;
    }

    public double getCGPA()
    {
        return cgpa;
    }

    public String getName()
    {
        return name;
    }
}
class Priorities
{
    List<Stud> getStudents(List<String> events)
    {
        Comparator<Stud> StudComparator = Comparator.comparing(Stud::getCGPA).reversed().thenComparing(Stud::getName).thenComparing(Stud::getID);

        PriorityQueue < Stud > student_queue = new PriorityQueue(StudComparator);


        //Collections.sort(student_queue, StudComparator);

        List < Stud > students = new ArrayList < Stud > ();

        for (String e: events) {
            Scanner in =new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int ID = in.nextInt();

                Stud student = new Stud(name,ID,cgpa);
                student_queue.add(student);
            }
            else if (event.equals("SERVED")) {
                Stud first = student_queue.poll();
            }
            in .close();
        }
        Stud first = student_queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = student_queue.poll();

            }
            return students;
        }
    }
}


public class PriorityQueues {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Stud> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Stud st: students) {
                System.out.println(st.getName());
            }
        }
    }
}