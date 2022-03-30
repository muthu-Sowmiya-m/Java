package HackerRank.exceptionhandling;

import java.util.*;
class Throw
{
    public long power(int n, int p) throws Exception
    {
        if(n < 0 || p<0 )
        {
            throw new Exception("n or p should not be negative.");
        }
        if(n==0 && p ==0)
        {
            throw new Exception("n and p should not be zero.");
        }
        long res = (long)Math.pow(n,p);
        return res;
    }

}

public class Solution {
    public static final Throw my_calculator = new Throw();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
}