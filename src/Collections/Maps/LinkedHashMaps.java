package Maps;

import java.util.*;

class Books
{
    int id;
    String name;
    String Author;
    Books(String name,String Author)
    {
        this.name = name;
        this.Author = Author;
    }
}

//same as Hashmaps but maintains insertion order
// Java program to demonstrate
// Iterating over LinkedHashMap
class LinkedHashMaps {
    public static void main(String args[])
    {
        LinkedHashMap<Integer,Books> lhm= new LinkedHashMap<Integer,Books>(10);

        Books B[] = new Books[3];
        B[0] = new Books("C programming","Dennis Richie");
        B[1] = new Books("C++ programming","Djarne");
        B[2] = new Books("Java","Gosling");

        // Inserting objects into Map using put() method
        lhm.put(3, B[0]);
        lhm.put(2, B[1]);
        lhm.put(1, B[2]);

        //Traversal
        for (Map.Entry<Integer, Books> lmapElement : lhm.entrySet())
        {
            int key = lmapElement.getKey();
            Books b = lmapElement.getValue();

            // Printing the key-value pairs
            System.out.println(key + " : " + b.name + " " + b.Author);
        }
    }
}
