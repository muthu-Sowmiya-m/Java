import java.util.Scanner;
import java.lang.*;
//import java.util.*;
public class StringIntro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //normal string declaration
        String s1 = "Hello there";
        //string declaration using stringb class
        String ob = new String("hello there");
        char arr[] = {'h', 'e', 'l', 'l', 'o'};
        //Converting array to string
        String ob2 = new String(arr);
        System.out.println(s1);
        System.out.println(ob);
        System.out.println(ob2);
    }
}