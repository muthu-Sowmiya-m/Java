package HackerRank.BigNumber;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BigInteger2{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BigInteger bigInt1= sc.nextBigInteger();
        BigInteger bigInt2= sc.nextBigInteger();
        System.out.println(bigInt1.add(bigInt2));
        System.out.println(bigInt1.multiply(bigInt2));
    }
}
