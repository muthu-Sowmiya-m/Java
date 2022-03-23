package Maps;

import java.util.*;

public class HashTables
    {
    public static void main(String[] args)
    {
        //1. Create Hashtable
        Hashtable<Integer, String> ht = new Hashtable<>();

        //2. Add mappings to hashtable
        ht.put(1,  "A");
        ht.put(2,  "B" );
        ht.put(3,  "C");

        System.out.println(ht);

        //3. Get a mapping by key
        String value = ht.get(1);
        System.out.println("The value sor key '1' is :" + value);

        //4. Remove a mapping
        ht.remove(3);

        //5. Iterate over mappings using Enumeration
        Enumeration<Integer> e = ht.keys();


        while (e.hasMoreElements()) {

            // Getting key
            int k = e.nextElement();

            // Printing key and value corresponding to
            // that key
            System.out.println(k + ":" + ht.get(k));
        }
    }
}