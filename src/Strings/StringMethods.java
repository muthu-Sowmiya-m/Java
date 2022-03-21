import java.util.*;

public class StringMethods
{
    static String string;

    StringMethods(String str)
    {
        this.string = str;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        //to access a character at specific location
        String string = "HelloWorld";

        StringMethods str = new StringMethods(string);

        char ch = string.charAt(2); // prints l

        //to return a substring
        int start = in.nextInt(); // 3
        int end = in.nextInt();  // 7
        System.out.println(string.substring(start, end)); // prints loW

        //To print length of a string
        System.out.println(string.length());

        //splits the string
        String[] words = string.split("o");
        for (String w : words)
        {
            System.out.println(w);
        }

        //with trim()
        String s2 = "        hello string   ";
        System.out.println(s2.trim());
    }
}