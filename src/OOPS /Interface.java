//Interfaces can be used to implement Multiple Inheritance
interface Shape
{
    default void display()
    {
        System.out.println("The area is ");
    }
     abstract double area();

}
class Circle implements Shape
{

    private double radius;

    public Circle(double r)
    {
        this.radius = r;
    }

    @Override
    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }

}

class Square implements Shape
{

    private double length;

    public Square(double len) {
        this.length = len;
    }

    @Override
    public double area() {
        return Math.pow(length, 2.0);
    }
}
public class Interface
{
    public static void main(String args[])
    {
        //using interface
        Shape obj = new Circle(12.9);
        double res1 = obj.area();
        obj.display();
        System.out.println(res1);
        //switching to other
        Shape obj2 = new Square(12);
        double res2 = obj2.area();
        obj.display();
        System.out.println(res2);
    }
}