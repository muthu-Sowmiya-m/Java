package HackerRank.Introduction;

import java.util.*;
import java.lang.Math;

class Loops2
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a ;
            for(int j=0;j<n;j++)
            {
                int power =(int)Math.pow(2,j);
                result = result + (power * b);
                int res = result ;
                System.out.print(result + "\t");
            }
            System.out.println();
        }
        in.close();
    }
}
