package HackerRank.exceptionhandling;

import java.util.*;

public class tryCatch{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x/y);
    }
    catch(InputMismatchException e)
    {
         System.out.println(e.getClass().getName());
    }
    catch(ArithmeticException e)
    {
          System.out.println(e);
    }
}
}
