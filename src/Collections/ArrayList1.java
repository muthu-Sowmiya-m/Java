import java.util.*;
import java.lang.*;


public class ArrayList1
{

    public void display(ArrayList list)
    {
        System.out.println(list);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList(n);
        // Adding elements to list
        System.out.println("Enter the elements " );

        for (int i = 0; i < n; i++)
        {
            list.add(i);
        }
        ArrayList1 ob = new ArrayList1();
        ob.display(list);

        //removing elements in list
        list.remove(1);

        ob.display(list);
        //Accessing through index
        int element = list.get(2);
        System.out.println(element);
        //Printing size in Arraylist
        System.out.println(list.size());

        //Dynamically reallocates memory
        for (int i = 0; i < n; i++)
        {
            list.add(i);
        }
        ob.display(list);
    }
}