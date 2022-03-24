package HackerRank.DataStructures;
import java.util.*;

public class ArrayLists {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>(n);

        for(int i=0;i<n;i++)
        {
            int len = sc.nextInt();
            ArrayList<Integer> li = new ArrayList<>(len);
            for(int j=0;j<len;j++)
            {
                li.add(sc.nextInt());
            }
            arr.add(li);
        }

        int q = sc.nextInt();
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
