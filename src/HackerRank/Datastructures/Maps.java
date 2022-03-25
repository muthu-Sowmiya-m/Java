package HackerRank.Datastructures;
import java.util.*;
import java.io.*;

class Maps
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        Map<String,Integer> mp = new HashMap<>(n);
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            mp.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(mp.containsKey(s))
            {
                System.out.println( s +"=" + mp.get(s) );
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}



