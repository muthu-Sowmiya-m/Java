import java.lang.*;
class C
{
    int a = 20;
}
//Single Inheritance
public class Inheritance extends C
{
    public static void main(String args[])
    {
        Inheritance ob = new Inheritance();
        System.out.println(ob.a);
    }
}

