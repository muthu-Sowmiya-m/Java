package HackerRank.Datastructures;
import java.util.*;

public class Lists{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new LinkedList<Integer>();

        for(int i=0 ;i<n;i++)
        {
            int val = sc.nextInt();
            list.add(i,val);
        }
        int q = sc.nextInt();
        for(int i=0 ;i < q;i++)
        {
            String str =sc.next();
            if( str.equals("Insert"))
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x,y);
            }
            else
            {
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        sc.close();
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
