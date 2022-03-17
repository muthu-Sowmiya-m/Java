import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int start = 0;
        int flag =1;
        int end = A.length()-1;
        while(start < end)
        {
            if(A.charAt(start) == A.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                System.out.println("No");
                flag = 0;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Yes");
        }
    }
}



