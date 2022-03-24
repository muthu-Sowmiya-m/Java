package HackerRank.Introduction;
import java.util.*;
public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        scanner.close();
        if(n % 2 == 0)
        {
            if((n>=2 && n<=5) || n> 20)
            {
                System.out.println("Not Weird")  ;
            }
            else
            {
                System.out.println("Weird")  ;
            }
        }
        else
        {
            System.out.println("Weird")  ;
        }


    }
}
