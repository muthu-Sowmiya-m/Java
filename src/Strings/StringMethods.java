import java.util.*;
public class StringMethods {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //to access a character at specific location
        String str = "HelloWorld";
        char ch = str.charAt(2); // prints l
        //to return a substring
        int start = in.nextInt(); // 3
        int end = in.nextInt();  // 7
        System.out.println(str.substring(start, end)); // prints loW
        //To print length of a string
        System.out.println(str.length());
        //splits the string
        String[] words = str.split("o");
        for (String w : words) {
            System.out.println(w);
        }
        String s2 = "        hello string   ";
        System.out.println(s2.trim()); //with trim()
    }
}