package HackerRank.DataStructures;
import java.util.*;

public class SubArray {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt() ;
        }
        int count =0;
        for(int i=0;i<n;i++)
        {
            int sum =0;
            for(int j=i;j<n;j++)
            {
                sum=arr[j]+sum;
                //System.out.println(i + " ," +j);
                if(sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
