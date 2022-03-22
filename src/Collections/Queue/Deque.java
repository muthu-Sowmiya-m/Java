/*
Deques - "Double ended queues" can be implemented
either by ArrayDeque or LinkedList
*/

import java.util.*;

class Addition
{
    int a,b;
    int res;


    Addition(int a,int b)
    {
       this.a = a;
       this.b =b;
    }

    int add()

    {
        res = a + b;
        return res;
    }

}
class Deque
{
    public static void main(String args[])
    {
        ArrayDeque <Integer> aq = new ArrayDeque<Integer>(10);
        Addition a1 = new Addition(2,3);
        Addition a2 = new Addition(5,9);
        Addition a3 = new Addition(200,33);

        int res1 = a1.add();
        int res2 = a2.add();
        int res3 = a3.add();

        //Elements can be added and deleted at both ends
        aq.addFirst(res3);
        aq.addLast(res2);
        aq.offer(res1);   // adds at the tail

        System.out.println(aq);

        System.out.println(aq.removeFirst());
        System.out.println(aq.removeLast());

        ArrayList<Integer> col = new ArrayList<Integer>();

        // add Numbers in collection
        col.add(74);
        col.add(65);
        col.add(84);

        aq.addAll(col);
        System.out.println(aq);
        System.out.println(aq.peek()); //returns head element
        System.out.println(aq.poll()); //removes head element
        System.out.println(aq);

    }
}