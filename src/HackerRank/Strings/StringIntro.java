package HackerRank.Strings;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int l1 = A.length();
        int l2 = B.length();
        System.out.println(l1+l2);
        System.out.println((A.compareTo(B) > 0)?"Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase() + B.substring(1,B.length()));
    }
}



