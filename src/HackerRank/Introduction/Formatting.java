package HackerRank.Introduction;
import java.util.Scanner;

public class Formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String pad = String.format("%03d",x);
            String pad1 = String.format("%-15s",s1);
            System.out.println(pad1+pad);
            //System.out.print(x);

        }
        System.out.println("================================");

    }
}



