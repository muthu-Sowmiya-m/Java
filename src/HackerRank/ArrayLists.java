package HackerRank;
import java.io.*;
import java.util.*;

public class ArrayLists {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lists");
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>(n);

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the no of elements in" +i + "list");
            int len = sc.nextInt();
            ArrayList<Integer> li = new ArrayList<>(len);
            System.out.println("Enter the elements of" + i + "list");
            for(int j=0;j<len;j++)
            {
                li.add(sc.nextInt());
            }
            arr.add(li);
        }

        System.out.println("Enter the no of queries");
        int q = sc.nextInt();

        System.out.println("Enter the index and position aa x y :");
        for(int i=0;i<q;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            //System.out.println(x + " "+y);
            try
            {
                System.out.println(arr.get(x-1).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}