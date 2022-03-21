import java.util.*;

class PriorityQueues
{
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue <Integer> numbers = new PriorityQueue<>();
        PriorityQueue <String> strings = new PriorityQueue<String>();
        //Adding random elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);
        numbers.add(8);
        numbers.add(0);

        strings.add("Rohit");
        strings.add("Boom");
        strings.add("Rahul");

        //Using the iterator() method
        System.out.println("PriorityQueue using iterator() doesn't print in order of priority ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println(" ");

        //Based on Natural ordering
        //To print elements in the order of priority
        int length = numbers.size();
        for(int i=0;i<length;i++)
        {
            int element = numbers.poll();
            System.out.print(element);
            System.out.print(", ");
        }
        System.out.println(" ");
        int len = strings.size();
        System.out.println("Printing in ASCII order:");
        for(int i = 0;i < len ;i++)
        {
            String element = strings.poll();
            System.out.print(element);
            System.out.print(", ");
        }

    }
}