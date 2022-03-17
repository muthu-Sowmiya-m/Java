import java.lang.*;
import java.lang.annotation.*;
class CompileTimePolymorphism {
    void var() {
        System.out.println("No variables");
    }

    void var(int a, int b) {
        System.out.println("Two variables variables");
    }

    void var(int a, float b) {
        System.out.println("Two variables with different signatures");
    }

    void var(int... a) {
        System.out.println("var args");
    }

}
class A {
    void display()
    {
        System.out.println(" Base class");
    }
}
        class B extends A
    {
        @Override void display()
        {
            System.out.println(" Derived class");
        }
    }



public class Polymorphism
{
    public static void main(String args[])
    {
        CompileTimePolymorphism ob1 = new CompileTimePolymorphism();
        ob1.var();
        ob1.var(1,2);
        ob1.var(1,3.3f);
        ob1.var(1,2,3,4,5);


        A ob2 = new A();
        B ob3 = new B();
        ob2.display();
        ob3.display();
    }
}