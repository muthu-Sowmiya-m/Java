package HackerRank.BigNumber;
import java.math.BigDecimal;
import java.util.*;
public class BigDecimalwithComp {

        public static void main(String []args){
            //Input
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            String []s=new String[n+2];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
            }
            sc.close();


            Comparator<String> comp = new Comparator<String>() {
                @Override
                public int compare(String a1, String a2) {
                    //convert to big decimal inside comparator
                    //so permanent string values are never changed
                    //aka you only use the BigDecimal values to
                    //compare the strings!
                    BigDecimal a = new BigDecimal(a1);
                    BigDecimal b = new BigDecimal(a2);
                    return b.compareTo(a);
                }
            };
            Arrays.sort(s,0,n,comp);

            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
        }
    }

