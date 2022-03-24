package HackerRank.Datastructures;
import java.io.*;
import java.util.*;



public class TwoDArray
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int n=6;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum =Integer.MIN_VALUE;
        for(int i=0; i<n-2; i++)
        {

            for(int j=0; j<n-2; j++)
            {
                int sum1 = arr[i][j] + arr[i][j+1]+ arr[i][j+2]+arr[i+1]
                        [j+1]+arr[i+2][j] + arr[i+2][j+1]+ arr[i+2][j+2];
                if(sum1 >sum)
                {
                    sum = sum1;
                }
            }
        }
        System.out.println(sum);
    }
}
