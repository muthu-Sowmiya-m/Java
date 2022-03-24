package HackerRank.Basic;


import java.util.*;

public class EOF
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(sc.hasNextLine())
        {
            String str = sc.nextLine();
            i++;
            System.out.println(i + " " +str);
        }
    }
}
