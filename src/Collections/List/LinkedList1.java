import java.util.*;

class LinkedList1
{
    public static void main (String[] args)
    {
        //create a new linked list object
        LinkedList<String> days = new LinkedList<String>();

        // add elements to the linked list
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.addLast("Friday");

        //Display all the contents of the LinkedList
        Iterator < String > itr=days.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //Add First and Last Element in linked list
        days.addFirst("Sunday");
        days.addLast("Saturday");

        System.out.println("After Addition: " + days);

        //Insert an element in linked list
        days.add(0, "Days in a Week"); //add start of linked list
        days.add(4,"Middle"); //add in the middle of linked list
        days.add(9, "End");  //add in the lst of linked list
        System.out.println("After Insertion: " + days);

        //Traversing in reverse order
        Iterator < String > itrrev=days.descendingIterator();
        while(itrrev.hasNext()){
            System.out.println(itrrev.next());
        }
    }
}
