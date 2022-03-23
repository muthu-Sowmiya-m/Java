package Sets;
import java.util.*;

//HashMap doesn't allow duplicate values
public class HashSetsHackerRank
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of inputs: " );
        int t = s.nextInt();
        System.out.println("Enter the inputs :" );
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet <String> hs = new HashSet<>();
        for (int i = 0; i < t; i++)
        {
            hs.add(pair_left[i]+ " " +pair_right[i]);
            System.out.println(hs.size());
        }
       System.out.println(hs);
    }
}