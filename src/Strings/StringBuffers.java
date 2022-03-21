import java.util.Scanner;

class display
{
    void display(StringBuffer s)
    {
        System.out.println(s);
    }
}

//Mutable strings in java
public class StringBuffers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        display obj = new display();
        StringBuffer string = new StringBuffer(20);
        string.append(sc.nextLine());

        //length
        System.out.println(string.length());
        System.out.println(string.capacity());

        //charAt
        System.out.println(string.charAt(1));

        //insert
        string.insert(0,"Hiii! ");
       obj.display(string);

        //delete
        string.delete(0,1);
        obj.display(string);

        //deleteCharAt
        string.deleteCharAt(1);
        obj.display(string);

        //repalce
        string.replace(2,4,"$$$");
        obj.display(string);

        // get unicode of char at position 10
        int unicode = string.codePointAt(5);
        System.out.println(unicode);

    }
}