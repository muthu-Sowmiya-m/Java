package Maps;

import java.util.*;

public class HashMaps
{
    public static void main(String args[])
    {

        HashMap<Integer,String> hmap1 = new  HashMap<Integer,String>(10);
        //Adding key value pairs using "put"
        hmap1.put(1,"Sowmiya");
        hmap1.put(2,"Supriya");
        hmap1.put(3,"Divya");
        hmap1.put(4,"Keerthana");


        HashMap<Integer,String> hmap2 = new  HashMap<Integer,String>(10);
        //Adding a hashmap using "putall"
        hmap2.put(5,"Sathya");
        hmap2.put(6,"Mirna");
        hmap1.putAll(hmap2);
        System.out.println(hmap1);

        //traversing a map using for
        for(Map.Entry entry : hmap1.entrySet())
        {
            System.out.println(entry.getKey() +" " +entry.getValue()) ;
        }

        // Checking for the Value 'Sowmiya'
        System.out.println("Is the value 'Sowmiya' present? " +
                hmap1.containsValue("Sowmiya"));

        // Checking for the Key '9'
        System.out.println("Is the key '9' present? " +
                hmap1.containsKey(9));

        // remap the values using compute() method
       hmap1.compute(5,(k,v)->v.concat(" Priya"));

        // remap the values using computeIfAbsent() method
        hmap1.computeIfAbsent(10,k -> "Varuna");

        // remap the values using computeIfAbsent() method
        hmap1.computeIfPresent(10,(k,v) -> v.concat("Priya"));

        System.out.println(hmap1);

        //To remove
        hmap1.remove(10);
        System.out.println(hmap1);

        //Changing key and value using for each
        hmap2.forEach((key, value) -> {
            // increase value by 1
            key = key + 1;
            //changing value
            value = value.concat(" Priya");
            System.out.println(key + "=" + value + " ");
        });

        //Trying with Values as list
        HashMap<Integer,List<String>> hmap3 = new  HashMap<Integer,List<String>>(10);

        List<String> list= new ArrayList(10);
        list.add("Sowmiya");
        list.add("CSE");
        list.add("A");

        hmap3.put(1,list);
        System.out.println(hmap3);
    }
}