import java.util.*;
//To generate n fibonacci numbers
public class Fib
{
    static void fibbo(int num1,int num2,int var)
    {
        while (var-- > 2)
        {
            int res = 0;
            res = num1 + num2;
            num1 = num2;
            num2 = res;
            System.out.println(res);
        }
    }
    public static void main (String args[])
    {
        System.out.println("Enter the no of fibonacci terms to generate:");
        Scanner input = new Scanner(System.in);
        int var = input.nextInt();
        int a = 0 ;
        int b = 1 ;
        System.out.println(a);
        System.out.println(b);
        fibbo(a,b,var);

    }
}