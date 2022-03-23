package Sets;
import java.util.*;

public class TreeSets
{
    public static void main(String[] args) {
        TreeSet<Integer> ns = new TreeSet<>();

        ns.add(0);
        ns.add(3);
        ns.add(5);
        ns.add(2);
        ns.add(400);
        ns.add(500);
        ns.add(6);

        // Get the  reverse of the treeset
        NavigableSet<Integer> reverseNs = ns.descendingSet();


        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);

        System.out.println(ns.subSet(2,5));

        System.out.println("lower(3): " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));


        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set: " + ns);

        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set: " + ns);
    }
}
