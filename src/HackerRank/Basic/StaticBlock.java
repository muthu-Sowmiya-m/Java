package HackerRank.Basic;
import java.util.*;

public class StaticBlock
{
    static Scanner var = new Scanner(System.in);
    static boolean flag = true;
    static int B = var.nextInt();
    static int H = var.nextInt();

    static {
        if (B <= 0 || H <= 0)
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args)
    {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}






