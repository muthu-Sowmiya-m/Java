import java.util.*;

public class ALIterator
{
    public static void main(String args[])
    {
        //Adding elements to the list
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList(n);
        System.out.println("Enter the elements " );
        for (int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(list);

        //using iterators with arraylist
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            int num = (Integer)itr.next() ;
            System.out.println(num);
        }

        //Replacing element in Arraylist using index
        list.set(1,0);
        System.out.println(list);
    }
}
