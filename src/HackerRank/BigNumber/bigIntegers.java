package HackerRank.BigNumber;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class bigIntegers {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        BigInteger bigInt = new BigInteger(n);
        System.out.println(bigInt.isProbablePrime(1)?"prime":"not prime");
    }
}
