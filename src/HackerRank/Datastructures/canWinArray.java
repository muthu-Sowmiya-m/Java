package HackerRank.Datastructures;
import java.util.*;

public class canWinArray
{

    public static boolean canWin(int leap, int[] game)
    {
        return recurse(leap,game,0);
    }
    public static boolean recurse(int leap, int[] game,int i)
    {
        int n = game.length;

        if(i<0 || game[i]== 1)
        {
            return false;
        }

        if(i >= n-1 || i+leap > n-1)
        {
            return true;
        }
        game[i]=1;

        return recurse(leap,game,i+1)||recurse(leap,game,i-1)||recurse(leap,game,i+leap);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0)
        {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];

            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
