package HackerRank.oops;

class Arithmetic
{
    int sum =0;
    int add(int a,int b)
    {
        sum = a+b;
        return sum;
    }

}
class Adder extends Arithmetic
{
    int calladd(int a,int b)
    {
        return add(a,b);
    }
}



public class inheritance2{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}