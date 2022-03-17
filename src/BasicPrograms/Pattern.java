import java.util.Scanner;
/* TO PRINT
 *
 **
 ***
 ****
 *****
 ******
 *******
 */
public class Pattern
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int Row = scan.nextInt();
        for(int i =0 ;i < Row; i++)
        {
            for(int j = Row-i ; j > 1 ;j--)
            {
                System.out.print(" ");
            }
            for(int j =0  ; j <= i ;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}