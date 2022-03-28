package HackerRank.Advanced;
import java.io.*;


class Add
{
    public void add(int ...a)
    {
        int sum =0;
        String str = "";

        for(int i : a)
        {
            sum += i;
            str = str + "+" +i;
        }
        str=str.replaceFirst("\\+","");
        System.out.println(str + "=" + sum);
    }
}


public class Varargss
{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}

