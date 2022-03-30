package HackerRank.oops;
import java.util.*;
interface AdvancedArithmetic
{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        int sum =0;
        for(int i =1 ; i<=n ;i++)
        {
            if(n%i ==0)
            {
                sum = sum +i;
            }
        }
        return sum;
    }
}


class Interfaces{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    }


