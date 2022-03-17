import java.lang.*;
public class Constructors
{
    //DEFAULT CONSTRUCTOR
    int a,b;
    Constructors()
    {
        System.out.println("Default constructor initialised");
    }
    //PARAMATERIZED CONSTRUCTOR
    Constructors(int c,int d)
    {
        a = c;
        b = d;
        System.out.println(a+b);
    }
    //COPY CONSTRUCTOR
    Constructors(Constructors co)
    {
       a = co.a;
       b = co.b;
       System.out.println(a+b);
    }
    public static void main(String args[])
    {
        Constructors o1 = new Constructors();
        Constructors o2 =new Constructors(1,2);
        Constructors o3 = new Constructors(o2);
    }
}