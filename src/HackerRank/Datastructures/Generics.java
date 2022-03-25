package HackerRank.Datastructures;

class Printer<T>
{
    public void printArray(T[] arr)
    {
        for(T val : arr)
        {
            System.out.println(val);
        }
    }

}

public class Generics {


    public static void main(String args[])
    {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
    }
}