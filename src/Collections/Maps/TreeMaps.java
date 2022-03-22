package Maps;
import java.util.*;

class TreeMaps
{
    public static void main(String args[])
    {
        //Default Comparator
        TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
       /*To use custom comparator
        TreeMap<Integer,String> tmap = new TreeMap<Integer,String>(Collections.reverseOrder();
        */
        Comparator comp = tmap.comparator();
        tmap.put(100,"Amit");
        tmap.put(102,"Ravi");
        tmap.put(101,"Vijay");
        tmap.put(103,"Rahul");

        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: "+ tmap.headMap(102));

        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+ tmap.tailMap(102));

        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+ tmap.subMap(100, 102));

        //prints the treemap in reverse order
        System.out.println("descendingMap: "+ tmap.descendingMap());

        System.out.println("The Ceiling key for 50 is :" + tmap.ceilingKey(50));
        System.out.println("The lowest key value is :" + tmap.firstKey());

        tmap.replace(100,"Aswin");

        System.out.println("The Treemap key-values are :");
        // Traversing
        for(Map.Entry map : tmap.entrySet())
        {
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}