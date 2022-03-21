import java.lang.*;

//Hierarchical inheritance
class Animal
{
    void sound()
    {
        System.out.println("$$$$$$$");
    }
}

//Single Inheritance
class Dog extends Animal
{
    @Override
    void sound()
    {
        //Using super to call paarent class method
        super.sound();
        System.out.println("bark!!");
    }
}

class Cat extends Animal
{
    @Override
    void sound()
    {
        super.sound();
        System.out.println("meow!!");
    }
}

public class Inheritance extends Cat
{
    public static void main(String args[])
    {
        Cat obj = new Cat();
        obj.sound();

        Inheritance obj2 = new Inheritance();
        obj2.sound();

        Dog obj3 = new Dog();
        obj3.sound();
    }
}

/*Multilevel Inheritance
class Dog extends Animal
{
    @Override
    void sound()
    {
        super.sound();
        System.out.println("bark!!");
    }
}
class BabyDog extends Dog
{
    @Override
    void sound()
    {
        super.sound();
        System.out.println("Whine!!");
    }
}
 */

